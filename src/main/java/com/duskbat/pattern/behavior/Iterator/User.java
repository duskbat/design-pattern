package com.duskbat.pattern.behavior.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class User {

    public void func() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }

    public static void main(String[] args) {
        User user = new User();
        user.func();
    }
}
