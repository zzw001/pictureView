package scau.aotu.biz.service;

import scau.aotu.biz.model.User;

public interface UserService {

    int addUser(User user);

    User getUserByPrimaryKey(String userid);

    User getUserByUserName(String username);

    User getUserByEmail(String email);

    int update(User user);
}
