package com.duskbat.pattern.behavior.chain.responsibility;

public class Handler2 implements Handler{
    @Override
    public void process() {
        System.out.println("do process 2");
    }
}
