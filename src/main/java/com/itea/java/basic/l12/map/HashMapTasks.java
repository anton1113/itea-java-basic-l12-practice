package com.itea.java.basic.l12.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTasks {

    public static void main(String[] args) {
        Map<String, String> javaGroup = createMap();
        System.out.println(javaGroup);
        System.out.println(javaGroup.keySet());
        System.out.println(javaGroup.values());
    }

    private static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Nick", "Belov");
        map.put("Sergei", "Smoktii");
        map.put("Natalia", "Borodachova");
        map.put("Sergii", "Golin'ko");
        map.put("Denis", "Sedov");
        map.put("Anton", "Rasshchektaiev");
        return map;
    }
}
