package me.jackson.spring.test;

import me.jackson.spring.annotation.proxy.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/31
 */
public class AopTest {

    @Test
    public void testProxy(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(5,123);

        System.out.println(calculator.getClass() );
        // System.out.println(calculator);
    }
}
