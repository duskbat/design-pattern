package com.duskbat.pattern.behavior.mediator;

public class PartB implements Part {

    @Override
    public void doAction() {
        Mediator.deal(this);
    }

}
