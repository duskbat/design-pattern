package com.duskbat.pattern.creation.singleton;

/**
 * 非懒加载
 */
public class Singleton_0 {

    private static final Singleton_0 INSTANCE = new Singleton_0();

    private Singleton_0() {
    }

    public static Singleton_0 getInstance() {
        return INSTANCE;
    }
}

/**
 * 双检锁<br>
 * volatile
 */
class Singleton_1 {

    private static volatile Singleton_1 INSTANCE;

    private Singleton_1() {
    }

    public static Singleton_1 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton_1.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton_1();
                }
            }
        }
        return INSTANCE;
    }
}

/**
 * 静态内部类
 */
class Singleton_2 {

    private Singleton_2() {
    }

    public static Singleton_2 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton_2 INSTANCE = new Singleton_2();
    }
}

/**
 * enum
 */
enum Singleton_3 {
    /**
     * 实例
     */
    INSTANCE;

    /**
     * 其实instance是可见的
     */
    public static Singleton_3 getInstance() {
        return INSTANCE;
    }
}