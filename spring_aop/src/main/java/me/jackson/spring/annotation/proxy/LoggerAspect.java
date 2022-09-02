package me.jackson.spring.annotation.proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/30
 */
@Component
//通过aspec注解 将当前组件表示为切面
@Aspect
public class LoggerAspect {

    @Pointcut("execution(* me.jackson.spring.annotation.proxy.CalculatorPureImpl.*(..))")
    public void pointCut(){}
    /*
    抽取横切关注点 封装方法
     */
    @Before("pointCut()")
    public void beforeAdviceMethod(JoinPoint joinPoint){
        //获取方法名
        String typeName = joinPoint.getSignature().getName();
        System.out.println("loggerAspect, 方法: "+ typeName+" 前置通知 参数: " + Arrays.toString(joinPoint.getArgs()));
    }
    @After("pointCut()")
    public void afterAdvice(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("loggerAspect, 方法: " + signature.getName() + " 后置通知 执行完毕");
    }

    //在返回通知 若要获取目标对象的方法的返回值，
    //祝需要通过当前注解的returning属性，就可以将通知方法的某个参数指定为目标对象的返回值的参数
    @AfterReturning(value = "pointCut()", returning = "result")
    public void afterReturn(JoinPoint joinPoint, Object result){
        Signature signature = joinPoint.getSignature();
        System.out.println("loggerAspect, 方法: " + signature.getName() + " 返回通知, 结果: " + result);

    }
    @AfterThrowing(value = "pointCut()", throwing = "throwing")
    public void afterThrowing(JoinPoint joinPoint, Throwable throwing){
        Signature signature = joinPoint.getSignature();
        System.out.println("loggerAspect, 方法: " + signature.getName() + " 返回通知, 报错: " + throwing);

    }
    /*
    环绕通知的方法 一定要和目标对象的返回值一致
     */
    @Around("pointCut()")
    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint){
        Object proceed = null;
        Signature signature = joinPoint.getSignature();
        try {

            System.out.println("环绕通知-->loggerAspect, 方法: "+ signature.getName() +" 前置通知 参数: " + Arrays.toString(joinPoint.getArgs()));

            //表示目标方法的执行
            proceed = joinPoint.proceed();
            System.out.println(" 环绕通知--> loggerAspect, 方法: " + signature.getName() + " 返回通知, 结果: " + proceed);

        } catch (Throwable e) {
            System.out.println("环绕通知--> loggerAspect, 方法: " + signature.getName() + " 返回通知, 报错: " + e);

            throw new RuntimeException(e);
        } finally {
            System.out.println("环绕通知-->loggerAspect, 方法: " + signature.getName() + " 后置通知 执行完毕");

        }
        return proceed;
    }

}
