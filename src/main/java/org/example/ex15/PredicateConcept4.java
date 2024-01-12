package org.example.ex15;

import java.util.function.Predicate;

public class PredicateConcept4 {
    public static void main(String[] args) {

        // 1st way
        Predicate<String> startWithLetterM = x -> x.toLowerCase().startsWith("m");
        boolean result = startWithLetterM.test("Mithu");
        System.out.println(result);

        // 1st way
        Predicate<String> predicate1 = x -> x.toLowerCase().startsWith("a");
        boolean result1 = predicate1.test("Mithu");
        System.out.println(result1);

        // 2nd way
        Predicate<String> predicate2 = x -> x.toLowerCase().charAt(0) == 'm';
        System.out.println(predicate2.test("Mithu"));

        // 2nd way
        Predicate<String> predicate3 = x->x.toLowerCase().charAt(0)=='a';
        System.out.println(predicate3.test("Mithu"));


    }

}
