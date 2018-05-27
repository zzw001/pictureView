package scau.aotu.biz.security;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import scau.aotu.biz.model.Role;
import scau.aotu.biz.model.User;
import scau.aotu.biz.service.RoleService;
import scau.aotu.biz.service.UserService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecurityRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String email = String.valueOf(principals.getPrimaryPrincipal());
        User user = userService.getUserByEmail(email);
        Set<String> roles = new HashSet<>();
        roles.add(roleService.getRoleByUserId(user.getUserId()).getRoleName());
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        String email = upToken.getUsername();
        String password = new String((char[]) upToken.getPassword());
        User user = userService.authentication(new User(email,password));
        if(user == null){
            throw new AuthenticationException("用户名或密码错误");
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(email,password,getName());
        return info;
    }
}
