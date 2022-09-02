package me.jackson.spring.pojo;

import org.springframework.stereotype.Component;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/1
 */
@Component
public class User {
    private Integer userId;
    private String username;
    private Integer balance;

    public User() {
    }

    public User(Integer userId, String username, Integer balance) {
        this.userId = userId;
        this.username = username;
        this.balance = balance;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
