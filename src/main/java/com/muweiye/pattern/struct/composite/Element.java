package com.muweiye.pattern.struct.composite;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Element {
    public Element(String name) {
        this.name = name;
    }
    private String name;

    private final List<Element> elements = new ArrayList<>();

    public void add(Element e) {
        elements.add(e);
    }

}
