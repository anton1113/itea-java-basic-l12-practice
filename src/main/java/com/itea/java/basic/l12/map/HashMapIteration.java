package com.itea.java.basic.l12.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        System.out.println(map); // {one=1, two=2}

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            entry.setValue(entry.getValue() + 1);
        }
        System.out.println(map); // {one=2, two=3}
    }
}
