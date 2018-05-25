package scau.aotu.biz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scau.aotu.biz.dao.AuthenticationMapper;
import scau.aotu.biz.model.Authentication;
import scau.aotu.biz.service.AuthenticationService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private AuthenticationMapper authenticationMapper;

    @Override
    public int add(Authentication authentication) {
        return authenticationMapper.insert(authentication);
    }

    @Override
    public String getUserId(String code){
        return authenticationMapper.selectByCode(code);
    }
}
