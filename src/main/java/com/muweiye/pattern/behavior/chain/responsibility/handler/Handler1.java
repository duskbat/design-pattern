package com.muweiye.pattern.behavior.chain.responsibility.handler;

public class Handler1 implements Handler{
    @Override
    public void process() {
        System.out.println("do process 1");
    }
}
