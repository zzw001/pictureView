package scau.aotu.biz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import scau.aotu.biz.model.User;
import scau.aotu.biz.model.UserExample;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userId);

    User selectByUserName(String userName);

    User selectByEmail(String email);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //更新状态
    int updateByPrimaryKey();
}