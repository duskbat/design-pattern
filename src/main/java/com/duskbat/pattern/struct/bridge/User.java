package com.duskbat.pattern.struct.bridge;

import com.duskbat.pattern.struct.bridge.car.ABrandCar;
import com.duskbat.pattern.struct.bridge.car.Car;
import com.duskbat.pattern.struct.bridge.engine.BEngine;

/**
 * 桥接模式<br>
 * 用组合的方式, 减少多个独立变化维度引起的子类数量爆炸
 */
public class User {

    public void func() {
        Car car = new ABrandCar(new BEngine());
        car.drive();
    }

}
