package org.example.ex15;

import java.util.function.Predicate;

public class PredicateConcept1 {
    public static void main(String[] args) {
        Predicate<Integer> integerPredicate = x->x>100;
        boolean result = integerPredicate.test(10000);
        System.out.println(result);
    }
}
