package com.SRGMS.dao;

import com.SRGMS.model.Dsdetailresult;
import com.SRGMS.model.DsdetailresultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DsdetailresultMapper {
    long countByExample(DsdetailresultExample example);

    int deleteByExample(DsdetailresultExample example);

    int deleteByPrimaryKey(Integer dsdetailresultid);

    int insert(Dsdetailresult record);

    int insertSelective(Dsdetailresult record);

    List<Dsdetailresult> selectByExample(DsdetailresultExample example);

    Dsdetailresult selectByPrimaryKey(Integer dsdetailresultid);

    int updateByExampleSelective(@Param("record") Dsdetailresult record, @Param("example") DsdetailresultExample example);

    int updateByExample(@Param("record") Dsdetailresult record, @Param("example") DsdetailresultExample example);

    int updateByPrimaryKeySelective(Dsdetailresult record);

    int updateByPrimaryKey(Dsdetailresult record);
}