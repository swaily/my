package com.ssm.controller;

import com.ssm.model.Users;
import com.ssm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
    //创建服务层的引用
    @Autowired
    private UsersService usersService;

    @RequestMapping("test")
    public String test(){
        System.out.println("ok");
        return "index";
    }

    //查询所有用户的方法
    @RequestMapping("findAllUsers")
    public String findAllUsers(){

        for (Users u : usersService.findAllUsers()) {
            System.out.println(u);
        }

        return "index";
    }

    @RequestMapping("deleteUsers")
    public String deleteUsers(){
        int r=usersService.deleteUsers(8);
        System.out.println(r);

        return "index";
    }


}
