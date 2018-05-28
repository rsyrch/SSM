package ssm.dao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ssm.model.User;
import java.util.List;

/**
 * @FunctionName:
 * @Name: luo chuan
 * @Date: 2018/5/25 14:54
 * @Description:
 */
@Repository
public interface UserDao {
    User selectUserById(@Param("userId") Long userId);

    User selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone, @Param("state") Short state);

    List<User> selectAllUser();

    User selectUsetByName(@Param("userName") String userName);
}
