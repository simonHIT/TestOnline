package com.SRGMS.dao;

import com.SRGMS.model.Dsdetail;
import com.SRGMS.model.DsdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DsdetailMapper {
    long countByExample(DsdetailExample example);

    int deleteByExample(DsdetailExample example);

    int deleteByPrimaryKey(Integer dsdetailid);

    int insert(Dsdetail record);

    int insertSelective(Dsdetail record);

    List<Dsdetail> selectByExample(DsdetailExample example);

    Dsdetail selectByPrimaryKey(Integer dsdetailid);

    int updateByExampleSelective(@Param("record") Dsdetail record, @Param("example") DsdetailExample example);

    int updateByExample(@Param("record") Dsdetail record, @Param("example") DsdetailExample example);

    int updateByPrimaryKeySelective(Dsdetail record);

    int updateByPrimaryKey(Dsdetail record);
}