package com.duskbat.pattern.struct.composite;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Element {

    private String name;

    private final List<Element> elements = new ArrayList<>();


    public Element(String name) {
        this.name = name;
    }


    public void add(Element e) {
        elements.add(e);
    }

}
