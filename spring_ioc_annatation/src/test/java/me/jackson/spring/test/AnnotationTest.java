package me.jackson.spring.test;

import me.jackson.spring.controller.UserController;
import me.jackson.spring.dao.UserDAO;
import me.jackson.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/29
 */
public class AnnotationTest {

    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController controller = ioc.getBean(UserController.class);
        controller.saveUser();

        System.out.println(controller);
    }
}
