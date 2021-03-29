package com.android.design.strategy;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.strategy
 * @ClassName: Context
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 14:43
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
