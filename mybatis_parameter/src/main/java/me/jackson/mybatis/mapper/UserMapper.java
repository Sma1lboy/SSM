package me.jackson.mybatis.mapper;

import me.jackson.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/21
 */
public interface UserMapper {
    /**
     * according username to get user info
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    User checkLogin(String username, String password);

    User checkLoginByMap(HashMap<String, Object> map);

    /**
     * Add user info.
     * @param user
     */
    void insertUser(User user);

    /**
     * Check login by using @Param annotation.
     * @param username
     * @param password
     */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

}
