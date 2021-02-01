package com.example.pattern.invertion;

public class Person {
    public void receive(IReceiver i) {
        System.out.println(i.getInfo());
    }
}
