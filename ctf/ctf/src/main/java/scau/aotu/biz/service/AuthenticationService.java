package scau.aotu.biz.service;

import scau.aotu.biz.model.Authentication;

public interface AuthenticationService {

    int add(Authentication authentication);

    String getUserId(String code);
}
