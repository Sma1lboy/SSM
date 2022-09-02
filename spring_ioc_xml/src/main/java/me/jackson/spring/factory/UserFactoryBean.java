package me.jackson.spring.factory;

import me.jackson.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/28
 */
public class UserFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
