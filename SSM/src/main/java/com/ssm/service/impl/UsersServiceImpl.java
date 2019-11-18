package com.ssm.service.impl;

import com.ssm.mapper.UsersMapper;
import com.ssm.model.Users;
import com.ssm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

    //@Resource(name = "usersMapper",type = com.ssm.mapper.UsersMapper.class)
    @Autowired //将该属性所需要的对象自动依赖注入
    private UsersMapper usersMapper;
    @Override
    public List<Users> findAllUsers() {
        //调用UsersMapper中的查询方法
        List<Users> list=usersMapper.findAllUsers();
        return list;
    }

    @Override
    public int deleteUsers(int uid) {
        return usersMapper.deleteUsers(uid);
    }
}
