package com.itea.java.basic.l12.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add(null);
        set.add(null);
        System.out.println(set);
    }
}
