package scau.aotu.biz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import scau.aotu.biz.model.HintUsed;
import scau.aotu.biz.model.HintUsedExample;

public interface HintUsedMapper {
    int countByExample(HintUsedExample example);

    int deleteByExample(HintUsedExample example);

    int deleteByPrimaryKey(Integer hintUsedId);

    int insert(HintUsed record);

    int insertSelective(HintUsed record);

    List<HintUsed> selectByExample(HintUsedExample example);

    HintUsed selectByPrimaryKey(Integer hintUsedId);

    int updateByExampleSelective(@Param("record") HintUsed record, @Param("example") HintUsedExample example);

    int updateByExample(@Param("record") HintUsed record, @Param("example") HintUsedExample example);

    int updateByPrimaryKeySelective(HintUsed record);

    int updateByPrimaryKey(HintUsed record);
}