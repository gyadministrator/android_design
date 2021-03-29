package com.android.design.factory;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.factory
 * @ClassName: FactoryTest
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 14:29
 */

/**
 * 工厂方法模式有一个问题就是，
 * 类的创建依赖工厂类，
 * 也就是说，如果想要拓展程序，
 * 必须对工厂类进行修改，
 * 这违背了闭包原则。
 */
public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.send();
    }
}
