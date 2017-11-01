package llq.mapper;

import llq.model.User;

/**
 * Created by zl on 2015/8/27.
 */
public interface UserMapper {
    public User getUserInfo(String uid);
    public void addUser(User user);
}
