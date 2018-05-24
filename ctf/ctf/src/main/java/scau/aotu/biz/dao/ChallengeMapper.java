package scau.aotu.biz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import scau.aotu.biz.model.Challenge;
import scau.aotu.biz.model.ChallengeExample;

public interface ChallengeMapper {
    int countByExample(ChallengeExample example);

    int deleteByExample(ChallengeExample example);

    int deleteByPrimaryKey(String chalId);

    int insert(Challenge record);

    int insertSelective(Challenge record);

    List<Challenge> selectByExample(ChallengeExample example);

    Challenge selectByPrimaryKey(String chalId);

    int updateByExampleSelective(@Param("record") Challenge record, @Param("example") ChallengeExample example);

    int updateByExample(@Param("record") Challenge record, @Param("example") ChallengeExample example);

    int updateByPrimaryKeySelective(Challenge record);

    int updateByPrimaryKey(Challenge record);
}