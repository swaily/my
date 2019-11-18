package com.ssm.mapper;

import com.ssm.model.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsersMapper {
    @Select("select * from users")
    public List<Users> findAllUsers();
    @Delete("delete from users where uid=#{uid}")
    public int deleteUsers(int uid);
}
