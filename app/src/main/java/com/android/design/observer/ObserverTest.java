package com.android.design.observer;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.observer
 * @ClassName: ObserverTest
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 15:00
 */

/**
 * 定义与使用场景：一个对象(subject)被其他多个对象(observer)所依赖。
 * 则当一个对象变化时，发出通知，其它依赖该对象的对象都会收到通知，并且随着变化。
 * 比如 声音报警器和闪光灯报警器分别订阅热水器温度，热水器温度过高时，发出通知，
 * 两个报警器分别发声、闪光以实现报警。
 * 又比如很多人订阅微信公众号，该公众号有更新文章时，自动通知每个订阅的用户。
 * **实现：**1,多个观察者要订阅这个对象 2，这个对象要发出通知
 */
public class ObserverTest {
    public static void main(String[] args) {
        MySubject subject = new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());
        subject.operation();
    }
}
