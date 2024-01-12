package org.example.ex15;

import java.util.Arrays;
import java.util.List;

public class PredicateConcept3Old {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum =0;
        for (int number : numbers){
            if (number%2==0){
                sum +=number;
            }

        }
        System.out.println(sum);
    }
}
