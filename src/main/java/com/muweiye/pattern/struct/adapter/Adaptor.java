package com.muweiye.pattern.struct.adapter;

public class Adaptor implements A {

    private B b;


    @Override
    public void afunc() {
        b.bfunc();
    }
}
