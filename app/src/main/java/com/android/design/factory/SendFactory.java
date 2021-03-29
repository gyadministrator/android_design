package com.android.design.factory;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.factory
 * @ClassName: SendFactory
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 14:30
 */
public class SendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
