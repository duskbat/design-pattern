package com.muweiye.pattern.struct.proxy;

public class Proxy<T extends AInterface> implements AInterface {

    private final T real;

    public Proxy(T real) {
        this.real = real;
    }

    @Override
    public void action() {
        real.action();
    }

}
