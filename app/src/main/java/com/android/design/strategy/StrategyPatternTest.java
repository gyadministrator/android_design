package com.android.design.strategy;

import com.android.design.util.PrintUtil;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.strategy
 * @ClassName: StrategyPatternTest
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 14:45
 */

/**
 * 定义与使用场合：一个系统需要动态地在几种类似的算法中选择一种。
 * 与工厂模式异同：实例化一个对象的位置不同。
 * 对工厂模式而言，实例化对象是放在了工厂类里面。
 * 而策略模式实例化对象的操作在调用的地方。本质都是继承与多态。
 */
public class StrategyPatternTest {
    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        PrintUtil.print("10+5=" + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        PrintUtil.print("10-5=" + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        PrintUtil.print("10*5=" + context.executeStrategy(10, 5));
    }
}
