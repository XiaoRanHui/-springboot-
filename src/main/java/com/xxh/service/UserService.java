package com.xxh.service;

import com.xxh.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
