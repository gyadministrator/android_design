package com.android.design.observer;

import com.android.design.util.PrintUtil;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.observer
 * @ClassName: Observer2
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 14:53
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        PrintUtil.print("Observer2 has received !");
    }
}
