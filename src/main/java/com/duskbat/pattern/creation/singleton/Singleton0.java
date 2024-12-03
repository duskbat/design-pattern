package com.duskbat.pattern.creation.singleton;

/**
 * 非懒加载
 */
public class Singleton0 {

    private static final Singleton0 INSTANCE = new Singleton0();

    private Singleton0() {
    }

    public static Singleton0 getInstance() {
        return INSTANCE;
    }
}

/**
 * 双检锁<br>
 * volatile
 */
class Singleton1 {

    private static volatile Singleton1 INSTANCE;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton1.class) {
                if (INSTANCE == null)
                    INSTANCE = new Singleton1();
            }
        }
        return INSTANCE;
    }
}

/**
 * 静态内部类
 */
class Singleton2 {

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }
}

/**
 * enum
 */
enum Singleton3 {
    /**
     * 实例
     */
    INSTANCE;

    /**
     * 其实instance是可见的
     */
    public static Singleton3 getInstance() {
        return INSTANCE;
    }
}