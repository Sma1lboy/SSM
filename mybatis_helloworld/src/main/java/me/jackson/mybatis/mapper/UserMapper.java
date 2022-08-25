package me.jackson.mybatis.mapper;

import me.jackson.mybatis.pojo.User;

import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/20
 */
public interface UserMapper {
    /**
     * 添加用户信息.
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * delete user info.
     */
    void deleteUser();

    /**
     * get user by id.
     * @return
     */
    User getUserById();

    /**
     * get all user info
     * @return
     */
    List<User> getAllUser();
}
