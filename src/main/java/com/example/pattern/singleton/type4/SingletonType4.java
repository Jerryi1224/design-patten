package com.example.pattern.singleton.type4;

public class SingletonType4 {
    /**
     * 懒汉--同步方法
     * 优缺点说明：
     * <p>
     * 解决了线程安全问题
     * 效率太低了，每个线程在想获得类的实例时候，执行 getInstance()方法都要进行同步。
     * 而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接 return 就行了。方法进行同步效率太低
     * <p>
     * 结论：在实际开发中，不推荐使用这种方式
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

    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
