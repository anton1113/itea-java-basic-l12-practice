package com.itea.java.basic.l12.set;

import java.util.*;

public class RemoveDuplicatesFromList {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> numbers = getListOfNRandomNumbers();
        removeDuplicates(numbers);
        System.out.println(numbers);
    }

    private static void removeDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        Iterator<Integer> iterator = list.iterator();
        iterator.remove();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            if (!set.add(current)) {
                iterator.remove();
            }
        }
    }

    private static List<Integer> getListOfNRandomNumbers() {
        int n = getNumberFromUserInput();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(getNumberFromUserInput());
        }
        return numbers;
    }

    private static int getNumberFromUserInput() {
        return SCANNER.nextInt();
    }
}
