package com.SRGMS.dao;

import com.SRGMS.model.Emeter;
import com.SRGMS.model.EmeterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmeterMapper {
    long countByExample(EmeterExample example);

    int deleteByExample(EmeterExample example);

    int deleteByPrimaryKey(Integer emeterid);

    int insert(Emeter record);

    int insertSelective(Emeter record);

    List<Emeter> selectByExample(EmeterExample example);

    Emeter selectByPrimaryKey(Integer emeterid);

    int updateByExampleSelective(@Param("record") Emeter record, @Param("example") EmeterExample example);

    int updateByExample(@Param("record") Emeter record, @Param("example") EmeterExample example);

    int updateByPrimaryKeySelective(Emeter record);

    int updateByPrimaryKey(Emeter record);
}