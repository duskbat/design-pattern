package com.duskbat.pattern.behavior.memento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Changing {

    private String state;

    public void saveStateToMemento(Memento memento) {
        memento.save(this);
    }

    public void getStateToMemento(Memento memento) {
        memento.reset(this, 0);
    }

}

