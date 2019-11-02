package com.example.springbootprovider.serviceImpl;

import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;
import service.UserService;
import java.util.Arrays;
import java.util.List;
//dubbo注解暴露服务
@Service
@Component
public class UserServiceImpl implements UserService {

    @HystrixCommand
    @Override
    public List<UserAddress> getUserAddress(Long userId) {
        System.out.println("old");
        System.out.println("收到用户id：" + userId);
        return Arrays.asList(new UserAddress(1L, "lij","beijing"),
                new UserAddress(1L, "lij","beijing"));
    }
}
