package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import ssm.model.User;
import ssm.service.impl.UserServiceImpl;

import javax.annotation.Resource;
import java.util.List;


/**
 * @FunctionName:
 * @Name: luo chuan
 * @Date: 2018/5/24 22:29
 * @Description:
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);

    private UserServiceImpl userService;

    @Resource
    @RequestMapping(value = "/showAllUser")
    /**
     * Name: showAllUser
     * Description: 得到所有用户
     * Author: luo chuan
     * CreateDate: 2018/5/24 22:38
    */
    public String showAllUser(Model model) {
        // 查询所有用户
        List<User> list  = userService.getAllUser();
        model.addAttribute("userList", list);
        return "shoUser";
    }
}
