package com.android.design.bridge;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.bridge
 * @ClassName: BridgeTest
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 15:11
 */

/**
 * 定义与使用场景：
 * 访问多种数据库驱动（多个具有共同特征的数据库驱动），
 * 不是直接访问，而是通过DriverManager桥来访问。
 *
 * 与策略模式的区别：(个人觉得较复杂，了解即可。本质都是面向接口编程，体现继承与多态)
 *
 * 策略模式：我要画圆，要实心圆，我可以用solidPen来配置，
 * 画虚线圆可以用dashedPen来配置。这是strategy模式。
 *
 * 桥接模式：同样是画圆，我是在windows下来画实心圆，就用windowPen+solidPen来配置，
 * 在unix下画实心圆就用unixPen+solidPen来配置。如果要再windows下画虚线圆，
 * 就用windowsPen+dashedPen来配置，要在unix下画虚线圆，就用unixPen+dashedPen来配置。
 *
 * 所以相对策略模式，桥接模式要表达的内容要更多，结构也更加复杂。
 */
public class BridgeTest {
}
