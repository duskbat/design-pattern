package com.muweiye.pattern.struct.bridge.car;

import com.muweiye.pattern.struct.bridge.engine.Engine;

public abstract class Car {

    protected Engine engine;


    protected Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
    }

}

