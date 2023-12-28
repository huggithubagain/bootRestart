package com.example.bootrestart.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.bootrestart.entity.Order;
import com.example.bootrestart.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class OrderController {
    @Autowired
    private OrderMapper orderMapper;
    @GetMapping("/order/all")
    public IPage getOrderAll() {
        Page<Order> page = new Page<>(0, 2);
        IPage iPage = orderMapper.selectPage(page, null);
        //List<Order> orders = orderMapper.selectList(null);
        //System.out.println(orders);
        return iPage;
    }

    @GetMapping("/order/uid")
    public List<Order> getOrderByUid() {
        List<Order> orders = orderMapper.selectByUid(1);
        System.out.println(orders);
        return orders;
    }
    @GetMapping("/order/AllOrderAndUser")
    public List<Order> selectAllOrderAndUser() {
        List<Order> orders = orderMapper.selectAllOrderAndUser();
        System.out.println(orders);
        return orders;
    }

}
