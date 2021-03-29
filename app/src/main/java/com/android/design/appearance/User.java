package com.android.design.appearance;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.appearance
 * @ClassName: User
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 15:21
 */

/**
 * 定义与使用场景：见例子。又比如，去医院看病，
 * 可能要去挂号、门诊、划价、取药，让患者或患者家属觉得很复杂，
 * 如果有提供接待人员，只让接待人员来处理，就很方便。
 * 例子：计算机启动，需要先启动CPU，再启动memory，
 * 最后启动disk。这三个类之间具有先后关系（依赖关系）。
 *
 * 与工厂模式的区别：工程模式多个类具有共同特征（继承一个共同的接口），
 * 是并列的。而外观模式多个类是有先后关系，是串行的，用组合。
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
