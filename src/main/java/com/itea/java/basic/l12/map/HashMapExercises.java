package com.itea.java.basic.l12.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExercises {

    /**
     * This is our SPAAARRTAAA
     * @param args
     */
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        map.put(2, 100);
        map.put(3, 100);
        map.put(4, 100);
        map.put(5, 100);

        map.put(1, 1000);

        map.put(null, 0);

        map.remove(null);
        map.remove(5, 90);

        Integer value = map.get(1);
        System.out.println(value);

        System.out.println(map.containsKey(null)); // false
        System.out.println(map.containsValue(1000)); // true

        Set<Integer> keys = map.keySet();
        System.out.println("Keys " + keys);

        Collection<Integer> values = map.values();
        System.out.println(values);

        System.out.println(map);

        iterateMap(map);
    }

    private static void iterateMap(Map<Integer, Integer> map) {
        System.out.println("\nIterate via keySet");
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            Integer value = map.get(key);
            System.out.println(key + " -> " + value);
        }

        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println("Value = " + value);
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            entry.setValue(value * 5);
            System.out.println(key + " -> " + value);
        }

        System.out.println(map);
    }
}
