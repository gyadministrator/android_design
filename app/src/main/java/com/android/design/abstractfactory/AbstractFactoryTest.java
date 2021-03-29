package com.android.design.abstractfactory;

import com.android.design.factory.Sender;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.abstractfactory
 * @ClassName: AbstractFactoryTest
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 14:37
 */

/**
 * 如果要新增发送微信，
 * 则只需做一个实现类，
 * 实现Sender接口，
 * 同时做一个工厂类，实现Provider接口，
 * 就OK了，无需去改动现成的代码。
 * 这样做，拓展性较好！
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        SendMailFactory factory = new SendMailFactory();
        Sender produce = factory.produce();
        produce.send();
    }
}
