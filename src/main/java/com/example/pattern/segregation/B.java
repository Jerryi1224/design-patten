package com.example.pattern.segregation;

public class B implements Interface1, Interface2{
    @Override
    public void operator1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operator2() {
        System.out.println("B 实现了 operation2");
    }

    @Override
    public void operator3() {
        System.out.println("B 实现了 operation3");
    }
}
