package me.jackson.spring.dao.impl;

import me.jackson.spring.dao.UserDAO;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/28
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
