package me.jackson.spring.service.impl;

import me.jackson.spring.dao.UserDAO;
import me.jackson.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/29
 */

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    // @Qualifier("userDAOImpl")
    UserDAO userDAO = null;


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
