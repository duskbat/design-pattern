package com.duskbat.pattern.struct.decorator.node;

public class HeadNode implements Node {

    @Override
    public <T> void doAction(T param) {
        System.out.println("headNode do action");
    }

}
