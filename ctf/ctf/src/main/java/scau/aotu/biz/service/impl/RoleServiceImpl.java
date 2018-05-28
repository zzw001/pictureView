package scau.aotu.biz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scau.aotu.biz.dao.RoleMapper;
import scau.aotu.biz.dao.UserRoleMapper;
import scau.aotu.biz.model.Role;
import scau.aotu.biz.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role getRoleByUserId(String userid) {
        return roleMapper.selectByPrimaryKey(userRoleMapper.selectByUserId(userid).getRoleId());
    }
}
