package com.example.springbootconsumer.service.impl;

import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.springbootconsumer.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;

    @HystrixCommand(fallbackMethod = "fallback")
    @Override
    public List<UserAddress> initOrder(Long userId) {
        System.out.println("调用接口...");
        List<UserAddress> userAddressList = userService.getUserAddress(userId);
        return userAddressList;
    }

    public List<UserAddress> fallback(Long userId) {
        System.out.println("熔断...");
        List<UserAddress> userAddressList = new ArrayList<>();
        return userAddressList;
    }
}
