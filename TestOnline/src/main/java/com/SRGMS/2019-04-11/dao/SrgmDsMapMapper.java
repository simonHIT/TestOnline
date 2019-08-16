package com.SRGMS.dao;

import com.SRGMS.model.SrgmDsMap;
import com.SRGMS.model.SrgmDsMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrgmDsMapMapper {
    long countByExample(SrgmDsMapExample example);

    int deleteByExample(SrgmDsMapExample example);

    int deleteByPrimaryKey(Integer mapid);

    int insert(SrgmDsMap record);

    int insertSelective(SrgmDsMap record);

    List<SrgmDsMap> selectByExample(SrgmDsMapExample example);

    SrgmDsMap selectByPrimaryKey(Integer mapid);

    int updateByExampleSelective(@Param("record") SrgmDsMap record, @Param("example") SrgmDsMapExample example);

    int updateByExample(@Param("record") SrgmDsMap record, @Param("example") SrgmDsMapExample example);

    int updateByPrimaryKeySelective(SrgmDsMap record);

    int updateByPrimaryKey(SrgmDsMap record);
}