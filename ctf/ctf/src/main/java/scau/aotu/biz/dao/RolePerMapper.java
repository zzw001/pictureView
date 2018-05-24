package scau.aotu.biz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import scau.aotu.biz.model.RolePer;
import scau.aotu.biz.model.RolePerExample;

public interface RolePerMapper {
    int countByExample(RolePerExample example);

    int deleteByExample(RolePerExample example);

    int deleteByPrimaryKey(Integer rolePerId);

    int insert(RolePer record);

    int insertSelective(RolePer record);

    List<RolePer> selectByExample(RolePerExample example);

    RolePer selectByPrimaryKey(Integer rolePerId);

    int updateByExampleSelective(@Param("record") RolePer record, @Param("example") RolePerExample example);

    int updateByExample(@Param("record") RolePer record, @Param("example") RolePerExample example);

    int updateByPrimaryKeySelective(RolePer record);

    int updateByPrimaryKey(RolePer record);
}