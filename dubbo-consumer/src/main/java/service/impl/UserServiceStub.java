package service.impl;

import bean.UserAddress;
import com.alibaba.dubbo.rpc.cluster.LoadBalance;
import service.UserService;
import java.util.List;

public class UserServiceStub implements UserService {

    private final UserService userService;

    /**dubbo会自动传入服务的远程代理对象**/
    public UserServiceStub(UserService userService) {
        super();
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddress(Long userId) {
        //TODO 查询缓存，如果缓存没有，再进行消费
        System.out.println("查询缓存，缓存没有，进行消费");
        return userService.getUserAddress(userId);
    }
}
