package org.example.ex15;

import java.util.Arrays;
import java.util.List;

public class PredicateConcept3 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = integerList.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(sum);
    }
}
