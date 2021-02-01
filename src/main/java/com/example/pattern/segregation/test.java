package com.example.pattern.segregation;

/**
 * 接口隔离原则
 */
public class test {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());

    }



}

class A {
    public void depend1(Interface1 i) {
        i.operator1();
    }

    public void depend2(Interface2 i) {
        i.operator2();
    }
    public void depend3(Interface2 i) {
        i.operator3();
    }
}

class C {
    public void depend1(Interface1 i) {
        i.operator1();
    }

    public void depend4(Interface3 i) {
        i.operator4();
    }
    public void depend5(Interface3 i) {
        i.operator5();
    }
}
