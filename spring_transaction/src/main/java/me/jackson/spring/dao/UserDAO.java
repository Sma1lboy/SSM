package me.jackson.spring.dao;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/1
 */
public interface UserDAO {

    /**
     * 更新用户余额
     * @param id
     * @param price
     */
    void updateBalence(Integer id, Integer price);
}
