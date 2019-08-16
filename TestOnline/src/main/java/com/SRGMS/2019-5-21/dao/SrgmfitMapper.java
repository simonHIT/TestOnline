package com.SRGMS.dao;

import com.SRGMS.model.Srgmfit;
import com.SRGMS.model.SrgmfitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrgmfitMapper {
    long countByExample(SrgmfitExample example);

    int deleteByExample(SrgmfitExample example);

    int deleteByPrimaryKey(Integer srgmfitid);

    int insert(Srgmfit record);

    int insertSelective(Srgmfit record);

    List<Srgmfit> selectByExample(SrgmfitExample example);

    Srgmfit selectByPrimaryKey(Integer srgmfitid);

    int updateByExampleSelective(@Param("record") Srgmfit record, @Param("example") SrgmfitExample example);

    int updateByExample(@Param("record") Srgmfit record, @Param("example") SrgmfitExample example);

    int updateByPrimaryKeySelective(Srgmfit record);

    int updateByPrimaryKey(Srgmfit record);
}