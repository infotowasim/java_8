package org.example.ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(6);
        integerList.add(7);
        integerList.add(11);
        integerList.add(100);
        integerList.add(5);

        Collections.sort(integerList, (a, b) -> b - a);
        System.out.println(integerList);
    }
}
