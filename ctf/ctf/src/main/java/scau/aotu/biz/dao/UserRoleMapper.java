package scau.aotu.biz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import scau.aotu.biz.model.UserRole;
import scau.aotu.biz.model.UserRoleExample;

public interface UserRoleMapper {
    int countByExample(UserRoleExample example);

    int deleteByExample(UserRoleExample example);

    int deleteByPrimaryKey(Integer userRoleId);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> selectByExample(UserRoleExample example);

    UserRole selectByPrimaryKey(Integer userRoleId);

    //根据userid获取userRole
    UserRole selectByUserId(String userId);

    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}