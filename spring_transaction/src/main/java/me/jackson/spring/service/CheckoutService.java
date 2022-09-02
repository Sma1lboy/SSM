package me.jackson.spring.service;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/1
 */
public interface CheckoutService {

    /**
     * 结账 买多本书
     * @param userId
     * @param bookIds
     */
    void checkout(Integer userId, Integer[] bookIds);
}
