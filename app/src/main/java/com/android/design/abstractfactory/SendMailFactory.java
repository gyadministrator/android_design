package com.android.design.abstractfactory;

import com.android.design.factory.MailSender;
import com.android.design.factory.Sender;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.abstractfactory
 * @ClassName: SendMailFactory
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 14:35
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
