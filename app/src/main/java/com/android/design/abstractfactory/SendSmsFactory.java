package com.android.design.abstractfactory;

import com.android.design.factory.Sender;
import com.android.design.factory.SmsSender;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.abstractfactory
 * @ClassName: SendSmsFactory
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 14:36
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
