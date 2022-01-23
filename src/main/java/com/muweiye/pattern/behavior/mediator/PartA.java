package com.muweiye.pattern.behavior.mediator;

public class PartA implements Part {

    @Override
    public void doAction() {
        Mediator.deal(this);
    }

}
