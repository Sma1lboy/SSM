package me.jackson.spring.proxy;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/30
 */
public class CalculatorStaticProxy implements Calculator{
    /**
     * 目标类 or target
     */
    private CalculatorPureImpl calculatorPure;
    public CalculatorStaticProxy() {
        this.calculatorPure = new CalculatorPureImpl();
    }

    public CalculatorStaticProxy(CalculatorPureImpl calculatorPure) {
        this.calculatorPure = calculatorPure;
    }

    public CalculatorPureImpl getCalculatorPure() {
        return calculatorPure;
    }

    public void setCalculatorPure(CalculatorPureImpl calculatorPure) {
        this.calculatorPure = calculatorPure;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("日志 add 参数: " + i + " " + j);
        int res = calculatorPure.add(i, j);
        System.out.println("日志 结束");
        return res;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("日志 sub 参数: " + i + " " + j);
        int res = calculatorPure.sub(i, j);
        System.out.println("日志 结束");
        return res;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("日志 mul 参数: " + i + " " + j);
        int res = calculatorPure.mul(i, j);
        System.out.println("日志 结束");
        return res;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("日志 div 参数: " + i + " " + j);
        int res = calculatorPure.div(i, j);
        System.out.println("日志 结束");
        return res;
    }
}
