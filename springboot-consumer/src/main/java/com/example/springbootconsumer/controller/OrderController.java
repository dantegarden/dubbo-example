package com.example.springbootconsumer.controller;

import bean.UserAddress;
import com.example.springbootconsumer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/consume/{id}")
    public ResponseEntity init(@PathVariable Long id){
        List<UserAddress> userAddresses = orderService.initOrder(id);
        return ResponseEntity.ok(userAddresses);
    }
}
