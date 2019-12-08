package com.itea.java.basic.l12.bench;

public class CurrentMillisExample {

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
    }

    private void showTime(long currentTimeMillis) {
        long years = 0;
        long months = 0;
        long days = 0;
        long hours = 0;
        long minutes = 0;
        long seconds = 0;
        long millis = 0;

        millis = currentTimeMillis % 1000;
        currentTimeMillis /= 1000;
        seconds = currentTimeMillis % 60;
        currentTimeMillis /= 60;
        minutes = currentTimeMillis % 60;
        currentTimeMillis /= 60;
        hours = currentTimeMillis % 60;
        currentTimeMillis /= 60;
        days = currentTimeMillis % 24;
        currentTimeMillis /= 24;
        months = currentTimeMillis % 12;

        System.out.println();
    }
}
