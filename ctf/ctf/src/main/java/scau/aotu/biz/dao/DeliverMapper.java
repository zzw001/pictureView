package scau.aotu.biz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import scau.aotu.biz.model.Deliver;
import scau.aotu.biz.model.DeliverExample;

public interface DeliverMapper {
    int countByExample(DeliverExample example);

    int deleteByExample(DeliverExample example);

    int deleteByPrimaryKey(Integer deliId);

    int insert(Deliver record);

    int insertSelective(Deliver record);

    List<Deliver> selectByExample(DeliverExample example);

    Deliver selectByPrimaryKey(Integer deliId);

    int updateByExampleSelective(@Param("record") Deliver record, @Param("example") DeliverExample example);

    int updateByExample(@Param("record") Deliver record, @Param("example") DeliverExample example);

    int updateByPrimaryKeySelective(Deliver record);

    int updateByPrimaryKey(Deliver record);
}