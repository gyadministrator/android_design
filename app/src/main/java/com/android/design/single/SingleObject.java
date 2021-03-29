package com.android.design.single;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.single
 * @ClassName: SingleObject
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 14:49
 */

/**
 * 定义及使用场合：只有一个对象被创建。
 * 建议采用 饿汉式 创建方法。线程安全，容易实现。初始化慢一点。
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }
}
