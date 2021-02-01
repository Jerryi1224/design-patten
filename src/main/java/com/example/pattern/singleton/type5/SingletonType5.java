package com.example.pattern.singleton.type5;

public class SingletonType5 {
    /**
     * 懒汉--同步代码块
     * 优缺点说明：
     * <p>
     * 这种方式，本意是想对type4进行改进，但效果和type3一样，线程不安全，会产生多个实例
     * <p>
     * 结论：在实际开发中，不能使用这种方式.
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

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
