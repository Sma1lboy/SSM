package me.jackson.spring.controller;

import me.jackson.spring.service.UserService;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/28
 */
public class UserController {
    private UserService userService = null;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public void saveUser(){
        userService.saveUser();
    }

}
