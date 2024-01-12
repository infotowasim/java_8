package org.example.ex10;

import java.util.Map;
import java.util.TreeMap;

public class MyClass {
    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new TreeMap<>();
        integerStringMap.put(1,"a");
        integerStringMap.put(10,"j");
        integerStringMap.put(5,"e");
        integerStringMap.put(2,"b");
        integerStringMap.put(7,"g");
        integerStringMap.put(3,"c");

        System.out.println("Before Sorting "+integerStringMap);

        Map<Integer, String> integerStringMap2 = new TreeMap<>((a,b)->b-a);
        integerStringMap2.put(1,"a");
        integerStringMap2.put(10,"j");
        integerStringMap2.put(5,"e");
        integerStringMap2.put(2,"b");
        integerStringMap2.put(7,"g");
        integerStringMap2.put(3,"c");

        System.out.println("After Sorting "+integerStringMap2);


    }
}
