package com.example.bootrestart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.bootrestart.mapper")//配置mybatisplus扫描路径
public class BootRestartApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootRestartApplication.class, args);
    }

}
