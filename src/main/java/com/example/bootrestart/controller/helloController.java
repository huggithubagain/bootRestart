package com.example.bootrestart.controller;

import com.example.bootrestart.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello worl2222d";
    }

    @RequestMapping("/user/abc")
    public String hello1() {
        System.out.println("abc");
        return "hello worl2222d";
    }

    @RequestMapping(value = "/post1", method = RequestMethod.POST)
    public String postTest1( User user) {//不加@RequestBody接收表单
        System.out.println(user);
        return "ABC:osst;";
    }

    @RequestMapping(value = "/post2", method = RequestMethod.POST)
    public String postTest2(@RequestBody User user) {//加@RequestBody接收jon
        System.out.println(user);
        return "ABC:osst;";
    }
}
