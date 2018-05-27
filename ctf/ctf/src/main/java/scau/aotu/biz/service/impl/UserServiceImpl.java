package scau.aotu.biz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scau.aotu.biz.dao.UserMapper;
import scau.aotu.biz.model.User;
import scau.aotu.biz.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User getUserByUserName(String username) {
        return userMapper.selectByUserName(username);
    }

    @Override
    public User getUserByEmail(String email) {
        return userMapper.selectByEmail(email);
    }

    @Override
    public User getUserByPrimaryKey(String userid) {
        return userMapper.selectByPrimaryKey(userid);
    }

    @Override
    public int update(User user) {
        userMapper.updateByPrimaryKey(user);
        return 0;
    }

    @Override
    public User authentication(User user) {
        return userMapper.authentication(user);
    }
}
