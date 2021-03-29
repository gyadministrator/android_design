package com.android.design.observer;

import com.android.design.util.PrintUtil;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.observer
 * @ClassName: MySubject
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 14:59
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        PrintUtil.print("update self");
        notifyObservers();
    }
}
