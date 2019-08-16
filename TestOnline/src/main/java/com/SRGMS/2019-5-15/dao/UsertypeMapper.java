package com.SRGMS.dao;

import com.SRGMS.model.Usertype;
import com.SRGMS.model.UsertypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsertypeMapper {
    long countByExample(UsertypeExample example);

    int deleteByExample(UsertypeExample example);

    int deleteByPrimaryKey(Integer usertypeid);

    int insert(Usertype record);

    int insertSelective(Usertype record);

    List<Usertype> selectByExample(UsertypeExample example);

    Usertype selectByPrimaryKey(Integer usertypeid);

    int updateByExampleSelective(@Param("record") Usertype record, @Param("example") UsertypeExample example);

    int updateByExample(@Param("record") Usertype record, @Param("example") UsertypeExample example);

    int updateByPrimaryKeySelective(Usertype record);

    int updateByPrimaryKey(Usertype record);
}