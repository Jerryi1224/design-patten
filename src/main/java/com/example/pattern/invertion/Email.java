package com.example.pattern.invertion;

public class Email implements IReceiver{
    @Override
    public String getInfo() {
        return "hello，您接收到一封电子邮件！";
    }
}
