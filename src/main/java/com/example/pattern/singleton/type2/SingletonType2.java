package com.example.pattern.singleton.type2;

public class SingletonType2 {
    /**
     * 优缺点说明：
     * <p>
     * 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，
     * 就执行静态代码块中的代码，初始化类的实例。优缺点和type1是一样的。
     * <p>
     * 结论：这种单例模式可用，但是可能造成内存浪费
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

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
