package me.jackson.spring.dao.impl;

import me.jackson.spring.dao.UserDAO;
import org.springframework.stereotype.Repository;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/29
 */
@Repository
public class UserDAOImpl implements UserDAO {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
