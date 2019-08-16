package com.SRGMS.dao;

import com.SRGMS.model.Dstype;
import com.SRGMS.model.DstypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstypeMapper {
    long countByExample(DstypeExample example);

    int deleteByExample(DstypeExample example);

    int deleteByPrimaryKey(Integer dstypeid);

    int insert(Dstype record);

    int insertSelective(Dstype record);

    List<Dstype> selectByExample(DstypeExample example);

    Dstype selectByPrimaryKey(Integer dstypeid);

    int updateByExampleSelective(@Param("record") Dstype record, @Param("example") DstypeExample example);

    int updateByExample(@Param("record") Dstype record, @Param("example") DstypeExample example);

    int updateByPrimaryKeySelective(Dstype record);

    int updateByPrimaryKey(Dstype record);
}