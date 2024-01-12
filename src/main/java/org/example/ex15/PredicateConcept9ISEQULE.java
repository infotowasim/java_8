package org.example.ex15;

import java.util.function.Predicate;

public class PredicateConcept9ISEQULE {
    public static void main(String[] args) {

        // 1st way True
        Predicate<String> predicate = x -> x.toLowerCase().equals("Mithu");
        boolean result = predicate.test("Mithu");
        System.out.println(result);


        // 2nd way True
        Predicate<String> predicate1 = Predicate.isEqual("Sabnam");
        boolean result1 = predicate1.test("Sabnam");
        System.out.println(result1);


        // 1st way False
        Predicate<String> predicate2 = x -> x.toLowerCase().equals("Mithu");
        boolean result2 = predicate.test("Sabnam");
        System.out.println(result2);


        // 2nd way False
        Predicate<String> predicate3 = Predicate.isEqual("Sabnam");
        boolean result3 = predicate1.test("Mithu");
        System.out.println(result3);


    }
}
