package com.duskbat.pattern.struct.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    private static final Map<String, ?> CACHE = new HashMap<>();

    public static <T> T get(String key) {
        return (T) CACHE.get(key);
    }

}
