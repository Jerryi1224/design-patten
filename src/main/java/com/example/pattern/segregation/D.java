package com.example.pattern.segregation;

public class D implements Interface1, Interface3{
    @Override
    public void operator1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operator4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operator5() {
        System.out.println("D 实现了 operation5");
    }
}
