package me.jackson.spring.service.impl;

import me.jackson.spring.dao.UserDAO;
import me.jackson.spring.service.UserService;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/28
 */


public class UserServiceImpl implements UserService {
    private UserDAO userDAO = null;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void saveUser() {
        userDAO.saveUser();
    }
}
