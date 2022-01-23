package com.muweiye.pattern.behavior.memento;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Memento {

    private List<String> states = new ArrayList<>();

    public void save(Changing changing) {
        states.add(changing.getState());
    }

    public void reset(Changing changing, int index) {
        changing.setState(states.get(index));
    }
}
