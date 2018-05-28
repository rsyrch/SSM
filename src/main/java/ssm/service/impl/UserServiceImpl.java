package ssm.service.impl;

import ssm.dao.UserDao;
import ssm.model.User;
import ssm.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @FunctionName:
 * @Name: luo chuan
 * @Date: 2018/5/25 15:49
 * @Description:
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }

    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone,state);
    }

    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

    public User getUserByName(String userName) {
        return userDao.selectUsetByName(userName);
    }
}
