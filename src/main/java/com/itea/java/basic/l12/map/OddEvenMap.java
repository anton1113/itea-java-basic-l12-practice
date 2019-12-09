package com.itea.java.basic.l12.map;

import java.util.*;

public class OddEvenMap {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, List<Integer>> map = initMap();

        for (int i = 0; i < 10; i++) {
            int number = getNumber();
            if (isOdd(number)) {
                map.get("odd").add(number);
            } else {
                map.get("even").add(number);
            }
        }

        System.out.println(map);
    }

    private boolean isOdd(int number) {
        return number % 2 == 1;
    }

    private static int getNumber() {
        return SCANNER.nextInt();
    }

    private static Map<String, List<Integer>> initMap() {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("odd", new ArrayList<>());
        map.put("even", new ArrayList<>());
        return map;
    }
}
