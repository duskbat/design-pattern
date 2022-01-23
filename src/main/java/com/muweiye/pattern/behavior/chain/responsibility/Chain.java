package com.muweiye.pattern.behavior.chain.responsibility;

import com.muweiye.pattern.behavior.chain.responsibility.handler.Handler;

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
