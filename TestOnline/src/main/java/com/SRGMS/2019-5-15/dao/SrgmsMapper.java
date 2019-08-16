package com.SRGMS.dao;

import com.SRGMS.model.Srgms;
import com.SRGMS.model.SrgmsExample;
import com.SRGMS.model.SrgmsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrgmsMapper {
    long countByExample(SrgmsExample example);

    int deleteByExample(SrgmsExample example);

    int deleteByPrimaryKey(Integer srgmid);

    int insert(SrgmsWithBLOBs record);

    int insertSelective(SrgmsWithBLOBs record);

    List<SrgmsWithBLOBs> selectByExampleWithBLOBs(SrgmsExample example);

    List<Srgms> selectByExample(SrgmsExample example);

    SrgmsWithBLOBs selectByPrimaryKey(Integer srgmid);

    int updateByExampleSelective(@Param("record") SrgmsWithBLOBs record, @Param("example") SrgmsExample example);

    int updateByExampleWithBLOBs(@Param("record") SrgmsWithBLOBs record, @Param("example") SrgmsExample example);

    int updateByExample(@Param("record") Srgms record, @Param("example") SrgmsExample example);

    int updateByPrimaryKeySelective(SrgmsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SrgmsWithBLOBs record);

    int updateByPrimaryKey(Srgms record);
}