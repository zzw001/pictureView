package scau.aotu.biz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import scau.aotu.biz.model.Control;
import scau.aotu.biz.model.ControlExample;

public interface ControlMapper {
    int countByExample(ControlExample example);

    int deleteByExample(ControlExample example);

    int deleteByPrimaryKey(Integer ctlId);

    int insert(Control record);

    int insertSelective(Control record);

    List<Control> selectByExample(ControlExample example);

    Control selectByPrimaryKey(Integer ctlId);

    int updateByExampleSelective(@Param("record") Control record, @Param("example") ControlExample example);

    int updateByExample(@Param("record") Control record, @Param("example") ControlExample example);

    int updateByPrimaryKeySelective(Control record);

    int updateByPrimaryKey(Control record);
}