package com.example.bootrestart.mapper;

import com.example.bootrestart.entity.User;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@Mapper
public interface UserMapper {
  //  @GetMapping("select * from user")
    public List<User> find();

}
