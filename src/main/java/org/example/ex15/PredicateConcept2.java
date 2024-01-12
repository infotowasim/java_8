package org.example.ex15;

import java.util.function.Predicate;

public class PredicateConcept2 {
    public static void main(String[] args) {

        Predicate<Integer> predicate = x->x>10;
        boolean result = predicate.test(1);
        System.out.println(result);
    }
}
