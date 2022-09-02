package me.jackson.spring.proxy;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/30
 */
public class ProxyFactory {
    //目标类
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    public Object getProxy(){
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object resultObj = null;
                try {
                    System.out.println("日志 开始 方法 " + method.getName() + " 参数: " + Arrays.toString(args));
                    //proxy 代理对象
                    //method 表示重现的方法
                    //args 当前方法的的参数列表
                    resultObj = method.invoke(target, args);
                    System.out.println("日志 结束 方法 " + method.getName() + " 结果: " + resultObj  );
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("日志 异常 方法 " + method.getName() + " 异常: " + e );
                } finally {
                    System.out.println("日志 执行完毕s 方法 " + method.getName() + " 方法执行完毕");
                }
                return resultObj;
            }
        };

        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }

}
