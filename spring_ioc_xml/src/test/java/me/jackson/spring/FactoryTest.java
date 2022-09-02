package me.jackson.spring;

import me.jackson.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/28
 */
public class FactoryTest {
    @Test
    public void testFactory(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-factory.xml");
        User user1 = ioc.getBean(User.class);
        User user2 = ioc.getBean(User.class);
        System.out.println(user1 == user2);
    }
}
