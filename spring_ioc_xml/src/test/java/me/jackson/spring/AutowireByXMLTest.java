package me.jackson.spring;

import me.jackson.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/28
 */
public class AutowireByXMLTest {
    @Test
    public void testAutowire(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire.xml");

        UserController bean = ioc.getBean(UserController.class);
        bean.saveUser();
    }
}
