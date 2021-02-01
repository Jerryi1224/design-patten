package com.example.pattern.invertion;

/**
 * 依赖倒置原则
 */
public class DependencyInversion {
    public static void main(String[] args) {
        //客户端无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());

    }
}
