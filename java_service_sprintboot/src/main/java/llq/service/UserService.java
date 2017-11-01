package llq.service;

import llq.mapper.UserMapper;
import llq.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(String uid){
        User user=userMapper.getUserInfo(uid);
        return user;
    }

    public int addUser(User user){
        if (user == null)
            return 0;
        try {
            userMapper.addUser(user);
            return 1;
        }catch (Exception e){
            System.out.println("增加用户时出现异常!");
            e.printStackTrace();
            return -1;
        }
    }

}
