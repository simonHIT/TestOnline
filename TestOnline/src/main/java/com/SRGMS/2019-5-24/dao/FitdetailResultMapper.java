package com.SRGMS.dao;

import com.SRGMS.model.FitdetailResult;
import com.SRGMS.model.FitdetailResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FitdetailResultMapper {
    long countByExample(FitdetailResultExample example);

    int deleteByExample(FitdetailResultExample example);

    int deleteByPrimaryKey(Integer fitdetailResultid);

    int insert(FitdetailResult record);

    int insertSelective(FitdetailResult record);

    List<FitdetailResult> selectByExample(FitdetailResultExample example);

    FitdetailResult selectByPrimaryKey(Integer fitdetailResultid);

    int updateByExampleSelective(@Param("record") FitdetailResult record, @Param("example") FitdetailResultExample example);

    int updateByExample(@Param("record") FitdetailResult record, @Param("example") FitdetailResultExample example);

    int updateByPrimaryKeySelective(FitdetailResult record);

    int updateByPrimaryKey(FitdetailResult record);
}