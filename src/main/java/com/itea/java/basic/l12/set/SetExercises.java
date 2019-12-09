package com.itea.java.basic.l12.set;

import java.util.HashSet;
import java.util.Set;

public class SetExercises {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(100);
        set.add(24);
        set.add(334);
        set.add(41);
        set.add(512);

        set.add(101);
        set.add(24);
        set.add(334);
        set.add(41);
        set.add(512);

        set.add(null);
        set.add(null);

        System.out.println(set);
    }
}
