package com.duskbat.pattern.behavior.chain.responsibility;

import java.util.ArrayList;
import java.util.List;

public class Chain {

    private final List<Handler> chain = new ArrayList<>();

    public void addHandler(Handler handler) {
        chain.add(handler);
    }

    public void process() {
        chain.forEach(Handler::process);
    }


}
