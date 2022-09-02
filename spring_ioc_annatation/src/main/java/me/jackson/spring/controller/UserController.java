package me.jackson.spring.controller;

import me.jackson.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/29
 */
@Controller
public class UserController {


    UserService userService = null;


    public UserController() {
    }

    //    放有参构造上
//    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }

    @Autowired(required = false)
    // @Qualifier("userServiceImpl")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    public void saveUser() {
        userService.saveUser();
    }

    public void sb() {
        System.out.println("sbsbsb");
    }
}
