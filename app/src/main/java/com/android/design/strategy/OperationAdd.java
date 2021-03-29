package com.android.design.strategy;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.strategy
 * @ClassName: OperationAdd
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 14:42
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
