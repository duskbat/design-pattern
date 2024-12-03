package com.duskbat.pattern.struct.bridge;

/**
 * 桥接模式<br>
 * 用组合的方式, 避免多个独立维度引起的子类数量爆炸
 */
public class User {

    public void func() {
        Car car = new ABrandCar(new BEngine());
        car.drive();
    }

}
