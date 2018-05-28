package ssm.service;
import ssm.model.User;
import java.util.*;
/**
 * @FunctionName:
 * @Name: luo chuan
 * @Date: 2018/5/25 15:47
 * @Description:
 */
public interface UserService {
    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);

    User getUserByName(String userName);
}
