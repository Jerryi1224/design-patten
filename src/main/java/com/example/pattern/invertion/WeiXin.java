package com.example.pattern.invertion;

public class WeiXin implements IReceiver{
    @Override
    public String getInfo() {
        return "hello，有一条微信！";
    }
}
