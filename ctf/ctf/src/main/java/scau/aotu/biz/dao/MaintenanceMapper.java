package scau.aotu.biz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import scau.aotu.biz.model.Maintenance;
import scau.aotu.biz.model.MaintenanceExample;

public interface MaintenanceMapper {
    int countByExample(MaintenanceExample example);

    int deleteByExample(MaintenanceExample example);

    int deleteByPrimaryKey(Integer mateId);

    int insert(Maintenance record);

    int insertSelective(Maintenance record);

    List<Maintenance> selectByExample(MaintenanceExample example);

    Maintenance selectByPrimaryKey(Integer mateId);

    int updateByExampleSelective(@Param("record") Maintenance record, @Param("example") MaintenanceExample example);

    int updateByExample(@Param("record") Maintenance record, @Param("example") MaintenanceExample example);

    int updateByPrimaryKeySelective(Maintenance record);

    int updateByPrimaryKey(Maintenance record);
}