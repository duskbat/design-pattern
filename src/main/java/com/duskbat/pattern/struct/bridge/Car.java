package com.duskbat.pattern.struct.bridge;

public abstract class Car {

    protected final Engine engine;


    protected Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
    }

}

