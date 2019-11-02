package service;

import bean.UserAddress;

import java.util.List;

public interface UserService {
    public List<UserAddress> getUserAddress(Long userId);
}
