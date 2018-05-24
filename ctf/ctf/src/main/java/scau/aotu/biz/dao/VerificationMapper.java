package scau.aotu.biz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import scau.aotu.biz.model.Verification;
import scau.aotu.biz.model.VerificationExample;

public interface VerificationMapper {
    int countByExample(VerificationExample example);

    int deleteByExample(VerificationExample example);

    int deleteByPrimaryKey(Integer veriId);

    int insert(Verification record);

    int insertSelective(Verification record);

    List<Verification> selectByExample(VerificationExample example);

    Verification selectByPrimaryKey(Integer veriId);

    int updateByExampleSelective(@Param("record") Verification record, @Param("example") VerificationExample example);

    int updateByExample(@Param("record") Verification record, @Param("example") VerificationExample example);

    int updateByPrimaryKeySelective(Verification record);

    int updateByPrimaryKey(Verification record);
}