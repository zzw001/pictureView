package scau.aotu.biz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scau.aotu.biz.dao.UserRoleMapper;
import scau.aotu.biz.model.UserRole;
import scau.aotu.biz.service.UserRoleService;

@Service
public class UserRoleImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public int add(UserRole userRole) {
        return userRoleMapper.insert(userRole);
    }
}
