package scau.aotu.biz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import scau.aotu.biz.model.Submit;
import scau.aotu.biz.model.SubmitExample;

public interface SubmitMapper {
    int countByExample(SubmitExample example);

    int deleteByExample(SubmitExample example);

    int deleteByPrimaryKey(Integer subId);

    int insert(Submit record);

    int insertSelective(Submit record);

    List<Submit> selectByExample(SubmitExample example);

    Submit selectByPrimaryKey(Integer subId);

    int updateByExampleSelective(@Param("record") Submit record, @Param("example") SubmitExample example);

    int updateByExample(@Param("record") Submit record, @Param("example") SubmitExample example);

    int updateByPrimaryKeySelective(Submit record);

    int updateByPrimaryKey(Submit record);
}