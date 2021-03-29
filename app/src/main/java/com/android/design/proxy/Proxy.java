package com.android.design.proxy;

import com.android.design.util.PrintUtil;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.proxy
 * @ClassName: Proxy
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 15:07
 */
public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        PrintUtil.print("begin");
        subject.request();
        PrintUtil.print("end");
    }
}
