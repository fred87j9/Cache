package com.example.demo;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Cache {

    Map<String, Object> map;

    public Cache() {
        map = new HashMap<>();
    }

    public boolean has(String key) {
        if (map.containsKey(key)) {
            return true;
        }
        return false;
    }

    public void set(String key, Object val) {
        map.put(key, val);
        System.out.println(map.get(key));
    }

    public Object get(String key) {
        return map.get(key);
    }

    public void delete(String key) {
        map.remove(key);
    }
}