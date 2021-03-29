package com.android.design.proxy;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.proxy
 * @ClassName: ProxyTest
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 15:09
 */

/**
 * 定义与使用场景：一个代理类代表一个真实类的功能，通过访问代理类来实现对真实类的访问。
 * 比如买火车票这件小事：黄牛相当于是火车站的代理，我们可以通过黄牛买票，但只能去火车站进行改签和退票。
 * 又比如需要对原有的方法进行修改，就是采用一个代理类调用原有的方法，以避免修改原有代码。
 */
public class ProxyTest {
    public static void main(String[] args) {
        RealSubject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();
    }
}
