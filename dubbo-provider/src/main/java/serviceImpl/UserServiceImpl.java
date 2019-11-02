package serviceImpl;

import bean.UserAddress;
import service.UserService;
import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddress(Long userId) {
        System.out.println("old 收到用户id：" + userId);
        return Arrays.asList(new UserAddress(1L, "lij","beijing"),
                new UserAddress(1L, "lij","beijing"));
    }
}
