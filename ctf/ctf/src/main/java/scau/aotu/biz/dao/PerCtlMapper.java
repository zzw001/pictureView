package scau.aotu.biz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import scau.aotu.biz.model.PerCtl;
import scau.aotu.biz.model.PerCtlExample;

public interface PerCtlMapper {
    int countByExample(PerCtlExample example);

    int deleteByExample(PerCtlExample example);

    int deleteByPrimaryKey(Integer perCtlId);

    int insert(PerCtl record);

    int insertSelective(PerCtl record);

    List<PerCtl> selectByExample(PerCtlExample example);

    PerCtl selectByPrimaryKey(Integer perCtlId);

    int updateByExampleSelective(@Param("record") PerCtl record, @Param("example") PerCtlExample example);

    int updateByExample(@Param("record") PerCtl record, @Param("example") PerCtlExample example);

    int updateByPrimaryKeySelective(PerCtl record);

    int updateByPrimaryKey(PerCtl record);
}