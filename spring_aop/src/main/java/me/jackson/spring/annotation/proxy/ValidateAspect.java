package me.jackson.spring.annotation.proxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/31
 */
@Component
@Aspect
@Order(1 )
public class ValidateAspect {

    @Pointcut(value = "execution(* me.jackson.spring.annotation.proxy.CalculatorPureImpl.*(..))")
    public void pointCut(){};
    @Before("pointCut()")
    public void beforeMethod(){
        System.out.println("ValidateAspect --> 前置通知");
    }
}
