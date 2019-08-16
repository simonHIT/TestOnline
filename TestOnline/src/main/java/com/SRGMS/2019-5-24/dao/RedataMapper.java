package com.SRGMS.dao;

import com.SRGMS.model.Redata;
import com.SRGMS.model.RedataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RedataMapper {
    long countByExample(RedataExample example);

    int deleteByExample(RedataExample example);

    int deleteByPrimaryKey(Integer redataid);

    int insert(Redata record);

    int insertSelective(Redata record);

    List<Redata> selectByExample(RedataExample example);

    Redata selectByPrimaryKey(Integer redataid);

    int updateByExampleSelective(@Param("record") Redata record, @Param("example") RedataExample example);

    int updateByExample(@Param("record") Redata record, @Param("example") RedataExample example);

    int updateByPrimaryKeySelective(Redata record);

    int updateByPrimaryKey(Redata record);
}