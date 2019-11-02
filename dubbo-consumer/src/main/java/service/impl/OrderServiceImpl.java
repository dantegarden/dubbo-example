package service.impl;

import bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    @Override
    public void initOrder(Long userId) {
        System.out.println("调用接口...");
        List<UserAddress> userAddressList = userService.getUserAddress(userId);
        userAddressList.forEach(System.out::println);
    }
}
