package scau.aotu.biz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import scau.aotu.biz.model.Hint;
import scau.aotu.biz.model.HintExample;

public interface HintMapper {
    int countByExample(HintExample example);

    int deleteByExample(HintExample example);

    int deleteByPrimaryKey(Integer hintId);

    int insert(Hint record);

    int insertSelective(Hint record);

    List<Hint> selectByExample(HintExample example);

    Hint selectByPrimaryKey(Integer hintId);

    int updateByExampleSelective(@Param("record") Hint record, @Param("example") HintExample example);

    int updateByExample(@Param("record") Hint record, @Param("example") HintExample example);

    int updateByPrimaryKeySelective(Hint record);

    int updateByPrimaryKey(Hint record);
}