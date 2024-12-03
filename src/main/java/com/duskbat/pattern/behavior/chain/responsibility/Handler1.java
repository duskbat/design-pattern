package com.duskbat.pattern.behavior.chain.responsibility;

public class Handler1 implements Handler{
    @Override
    public void process() {
        System.out.println("do process 1");
    }
}
