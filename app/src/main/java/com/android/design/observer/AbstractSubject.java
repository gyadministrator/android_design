package com.android.design.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.observer
 * @ClassName: AbstractSubject
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 14:57
 */
public abstract class AbstractSubject implements Subject {
    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> elements = vector.elements();
        while (elements.hasMoreElements()) {
            elements.nextElement().update();
        }
    }
}
