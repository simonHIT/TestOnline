package com.SRGMS.dao;

import com.SRGMS.model.Fitdetail;
import com.SRGMS.model.FitdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FitdetailMapper {
    long countByExample(FitdetailExample example);

    int deleteByExample(FitdetailExample example);

    int deleteByPrimaryKey(Integer fitdetailid);

    int insert(Fitdetail record);

    int insertSelective(Fitdetail record);

    List<Fitdetail> selectByExample(FitdetailExample example);

    Fitdetail selectByPrimaryKey(Integer fitdetailid);

    int updateByExampleSelective(@Param("record") Fitdetail record, @Param("example") FitdetailExample example);

    int updateByExample(@Param("record") Fitdetail record, @Param("example") FitdetailExample example);

    int updateByPrimaryKeySelective(Fitdetail record);

    int updateByPrimaryKey(Fitdetail record);
}