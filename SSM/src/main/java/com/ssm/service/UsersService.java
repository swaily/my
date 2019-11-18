package com.ssm.service;

import com.ssm.model.Users;

import java.util.List;

public interface UsersService {
    public List<Users> findAllUsers();
    public int deleteUsers(int uid);
}
