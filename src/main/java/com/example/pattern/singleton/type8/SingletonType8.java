package com.example.pattern.singleton.type8;

public class SingletonType8 {
    /**
     * 懒汉--枚举
     * 优缺点说明：
     * 这借助 JDK1.5 中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
     * 这种方式是 Effective Java 作者 Josh Bloch  提倡的方式
     * 结论：推荐使用
     *
     * @param args
     */
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

enum Singleton {
    INSTANCE;
}
