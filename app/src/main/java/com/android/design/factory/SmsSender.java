package com.android.design.factory;

import com.android.design.util.PrintUtil;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.factory
 * @ClassName: SmsSender
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 14:28
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        PrintUtil.print("SmsSender  send ...");
    }
}
