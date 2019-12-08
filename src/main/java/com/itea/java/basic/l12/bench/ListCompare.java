package com.itea.java.basic.l12.bench;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ListCompare {

    public static void main(String[] args) {
        doBenchmark(new ArrayList());
        doBenchmark(new LinkedList());
    }

    private static void doBenchmark(List list) {
        initList(list);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100_0000; i++) {
            list.add(0, new Object());
        }
        long finishTime = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + " time elapsed " + (finishTime - startTime) + " ms");
    }


    private static void initList(List list) {
        for (int i = 0; i < 100; i++) {
            list.add(new Object());
        }
    }
}
