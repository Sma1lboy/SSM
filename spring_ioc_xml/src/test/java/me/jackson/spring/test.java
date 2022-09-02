package me.jackson.spring;

import me.jackson.spring.pojo.Clazz;
import me.jackson.spring.pojo.Person;
import me.jackson.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Target;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/27
 */
public class test {
    @Test
    public void testPNameZone(){
        //get ioc
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentSix = ioc.getBean("studentSix", Student.class);
        System.out.println(studentSix);
    }

    @Test
    public void testDIClazzClassObject(){
        //get ioc
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentFive = ioc.getBean("studentFive", Student.class);
        System.out.println(studentFive);
    }
    @Test
    public void testDI(){
        //get ioc
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentFour = ioc.getBean("studentFour", Student.class);
        System.out.println(studentFour);
    }
    @Test
    public void testIOC(){
        //get ioc
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //get bean
        Person studentOne = ioc.getBean(Person.class);

        System.out.println(studentOne);

    }
}
