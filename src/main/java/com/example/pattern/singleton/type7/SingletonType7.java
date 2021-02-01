package com.example.pattern.singleton.type7;

public class SingletonType7 {
    /**
     * 懒汉--静态内部类
     * 优缺点说明：
     * 这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
     * 静态内部类方式在 Singleton 类被装载时并不会立即实例化，而是在需要实例化时，调用 getInstance 方法，
     * 才会装载 SingletonInstance 类，从而完成 Singleton 的实例化。
     * 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM 帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
     * 优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
     * 结论：推荐使用.
     *
     * @param args
     */
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton {
    private Singleton() {
    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
