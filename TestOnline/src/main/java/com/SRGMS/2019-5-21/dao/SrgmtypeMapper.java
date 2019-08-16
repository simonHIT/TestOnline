package com.SRGMS.dao;

import com.SRGMS.model.Srgmtype;
import com.SRGMS.model.SrgmtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrgmtypeMapper {
    long countByExample(SrgmtypeExample example);

    int deleteByExample(SrgmtypeExample example);

    int deleteByPrimaryKey(Integer srgmtypeid);

    int insert(Srgmtype record);

    int insertSelective(Srgmtype record);

    List<Srgmtype> selectByExample(SrgmtypeExample example);

    Srgmtype selectByPrimaryKey(Integer srgmtypeid);

    int updateByExampleSelective(@Param("record") Srgmtype record, @Param("example") SrgmtypeExample example);

    int updateByExample(@Param("record") Srgmtype record, @Param("example") SrgmtypeExample example);

    int updateByPrimaryKeySelective(Srgmtype record);

    int updateByPrimaryKey(Srgmtype record);
}