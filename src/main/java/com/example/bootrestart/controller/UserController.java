package com.example.bootrestart.controller;

import com.example.bootrestart.entity.User;
import com.example.bootrestart.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user/all")
    //@PathVariable 获取动态参数
    public List<User> getAllUser(){
        List<User> userList = userMapper.getAllUser();
        System.out.println(userList);
        return userList;
    }
    @GetMapping("/user")
    //@PathVariable 获取动态参数
    public List<User> getUser(){
        List<User> userList = userMapper.selectList(null);
        System.out.println(userList);
        return userList;
    }


    @GetMapping("/user/{id}")
    //@PathVariable 获取动态参数
    public String getUserById(@PathVariable int id) {
        System.out.println(id);
        return "get";
    }
//
//    @PostMapping("/user")
//    public String save(User user) {
//        return "save";
//    }
//
//    @PutMapping("/user")
//    public String update(User user) {
//        return "update";
//    }
//    @DeleteMapping("/user/{id}")
//    public String deleteById(@PathVariable int id) {
//        System.out.println(id);
//        return "delete";
//    }
}
