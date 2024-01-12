package org.example.ex9;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(10);
        integerSet.add(6);
        integerSet.add(7);
        integerSet.add(11);
        integerSet.add(100);
        integerSet.add(5);

        System.out.println("Before Sorting " + integerSet);

        Set<Integer> integerSett = new TreeSet<>((a, b) -> b - a);
        integerSett.add(10);
        integerSett.add(6);
        integerSett.add(7);
        integerSett.add(11);
        integerSett.add(100);
        integerSett.add(5);

        System.out.println("After Sorting " + integerSett);

    }
}
