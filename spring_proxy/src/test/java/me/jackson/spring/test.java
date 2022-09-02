package me.jackson.spring;

import me.jackson.spring.proxy.Calculator;
import me.jackson.spring.proxy.CalculatorPureImpl;
import me.jackson.spring.proxy.CalculatorStaticProxy;
import me.jackson.spring.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/30
 */
public class test {
    @Test
    public void test(){

        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorPureImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        int add = proxy.add(1, 2);
    }

}
