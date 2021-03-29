package com.android.design.observer;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.observer
 * @ClassName: Subject
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 14:54
 */
public interface Subject {
    /**
     * 增加观察者
     **/
    void add(Observer observer);

    /**
     * 删除观察者
     */
    void del(Observer observer);

    /**
     * 通知所有的观察者
     */
    void notifyObservers();

    /**
     * 自身操作
     */
    void operation();
}
