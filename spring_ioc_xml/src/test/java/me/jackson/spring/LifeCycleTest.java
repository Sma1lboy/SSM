package me.jackson.spring;

import me.jackson.spring.pojo.Student;
import me.jackson.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/28
 */
public class LifeCycleTest {
    @Test
    public void testLifeCycle(){
        System.out.println("asdasd");
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("Spring-lifecycle.xml");
        User bean = ioc.getBean(User.class);
        System.out.println(bean);
        ioc.close();

    }
}
