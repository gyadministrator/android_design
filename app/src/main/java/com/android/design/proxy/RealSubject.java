package com.android.design.proxy;

import com.android.design.util.PrintUtil;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.proxy
 * @ClassName: RealSubject
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 15:06
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        PrintUtil.print("RealSubject");
    }
}
