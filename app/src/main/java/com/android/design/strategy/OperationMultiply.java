package com.android.design.strategy;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.strategy
 * @ClassName: OperationMultiply
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 14:43
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
