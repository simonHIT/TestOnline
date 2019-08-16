package com.testOnline.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;
import org.springframework.context.annotation.Scope;
import org.springframework.validation.BindingResult;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.toList;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "result")
//@Component(value = "result")// 用Spring标记该组件root
@Scope("prototype")
public class Result implements Serializable {

    /**
     * 本次操作状态(-1/0/其他),默认值为{code:0,msg:""} <br>
     * 0：正常<br>
     * -1：失败<br>
     * 其他：自定义值
     */
    private Status status = new Status();

    /**
     * 存放一个实体对象
     */
    private Object entity;

    /**
     * 存放一个Map对象
     */
    private Map<Object, Object> map;

    /**
     * 存放一个List集合
     */
    private List<?> dataList;

    /**
     * 存放一个Set集合
     */
    private Set<?> entitySet;

    @JsonProperty("link")
    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    /**
     * 存放工作流链接

     */
    private String Link;
    /**
     * 设置格式化数据的子节点
     */
    private Integer pageSize;//每页的行数
    private Integer pageCount;//总页数
    private Integer currentPage;//当前页
    private Integer totalCount;//总页数

    public Result(){

    }

    public Result(Status status){
        setStatus(status);
    }

    /**************** Beginning of Getter&Setter ***************/

    @JsonProperty(value = "status")
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("data")
    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }

    @JsonProperty("mapData")
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @JsonProperty("dataList")
    public List<?> getDataList() {
        return dataList;
    }

    public void setDataList(List<?> dataList) {
        this.dataList = dataList;
    }

    @JsonProperty("dataSet")
    public Set<?> getEntitySet() {
        return entitySet;
    }

    public void setEntitySet(Set<?> entitySet) {
        this.entitySet = entitySet;
    }

    @JsonProperty("pageSize")
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @JsonProperty("pageCount")
    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    @JsonProperty("currentPage")
    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @JsonProperty("totalCount")
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /****************End of Getter&Setter***************/


    /**
     * 设置返回成功信息
     * 返回的状态码为0
     *
     * @param msg 消息内容
     */
    public void setSuccess(String msg) {
        this.status = new Status(Constant.SUCCESS_STATUS_CODE, msg);
    }

    /**
     * 设置返回Error消息
     * 返回的状态码为-1
     *
     * @param errorMsg 消息内容
     */
    public void setError(String errorMsg) {
        this.status = new Status(Constant.ERROR_STATUS_CODE, errorMsg);
    }

    public void setValidation(BindingResult bindingResult){
        List<ApiFieldError> apiFieldErrors = bindingResult
                .getFieldErrors()
                .stream()
                .map(fieldError -> new ApiFieldError(
                        fieldError.getField(),
                        fieldError.getCode(),
                        fieldError.getRejectedValue())
                )
                .collect(toList());

        setDataList(apiFieldErrors);
    }
}
