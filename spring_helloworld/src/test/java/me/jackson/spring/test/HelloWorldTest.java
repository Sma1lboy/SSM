package me.jackson.spring.test;

import me.jackson.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/27
 */
public class HelloWorldTest {
    @Test
    public void test(){
        //get IOC containner
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ioc);
        //get IOC bean object
        Object world = ioc.getBean("helloWorld");
        HelloWorld helloWorld = (HelloWorld) world;
        helloWorld.sayHello();
     }
}
