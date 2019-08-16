package com.SRGMS.dao;

import com.SRGMS.model.Expression;
import com.SRGMS.model.ExpressionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpressionMapper {
    long countByExample(ExpressionExample example);

    int deleteByExample(ExpressionExample example);

    int deleteByPrimaryKey(Integer idexpression);

    int insert(Expression record);

    int insertSelective(Expression record);

    List<Expression> selectByExampleWithBLOBs(ExpressionExample example);

    List<Expression> selectByExample(ExpressionExample example);

    Expression selectByPrimaryKey(Integer idexpression);

    int updateByExampleSelective(@Param("record") Expression record, @Param("example") ExpressionExample example);

    int updateByExampleWithBLOBs(@Param("record") Expression record, @Param("example") ExpressionExample example);

    int updateByExample(@Param("record") Expression record, @Param("example") ExpressionExample example);

    int updateByPrimaryKeySelective(Expression record);

    int updateByPrimaryKeyWithBLOBs(Expression record);

    int updateByPrimaryKey(Expression record);
}