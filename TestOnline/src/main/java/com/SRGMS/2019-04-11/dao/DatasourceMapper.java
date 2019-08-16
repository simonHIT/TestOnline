package com.SRGMS.dao;

import com.SRGMS.model.Datasource;
import com.SRGMS.model.DatasourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatasourceMapper {
    long countByExample(DatasourceExample example);

    int deleteByExample(DatasourceExample example);

    int deleteByPrimaryKey(Integer dsid);

    int insert(Datasource record);

    int insertSelective(Datasource record);

    List<Datasource> selectByExampleWithBLOBs(DatasourceExample example);

    List<Datasource> selectByExample(DatasourceExample example);

    Datasource selectByPrimaryKey(Integer dsid);

    int updateByExampleSelective(@Param("record") Datasource record, @Param("example") DatasourceExample example);

    int updateByExampleWithBLOBs(@Param("record") Datasource record, @Param("example") DatasourceExample example);

    int updateByExample(@Param("record") Datasource record, @Param("example") DatasourceExample example);

    int updateByPrimaryKeySelective(Datasource record);

    int updateByPrimaryKeyWithBLOBs(Datasource record);

    int updateByPrimaryKey(Datasource record);
}