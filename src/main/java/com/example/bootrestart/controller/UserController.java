package com.example.bootrestart.controller;

import com.example.bootrestart.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {




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
