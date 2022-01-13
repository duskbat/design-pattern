package com.muweiye.pattern.behavior.chain.responsibility.handler;

public class Handler2 implements Handler{
    @Override
    public void process() {
        System.out.println("do process 2");
    }
}
