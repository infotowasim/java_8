package org.example.ex15;

import java.util.function.Predicate;

public class PredicateConcept5 {
    public static void main(String[] args) {

        // 1st way
        Predicate<String> endsWithLetterU = x -> x.toLowerCase().endsWith("u");
        System.out.println(endsWithLetterU.test("Mithu"));

        // 2nd way
        Predicate<String> endssWithLetterU = x -> x.toLowerCase().charAt(x.length() - 1) == 'u';
        System.out.println(endssWithLetterU.test("Mithu"));

        // 1st way
        Predicate<String> endsssWithLetterU = x -> x.toLowerCase().endsWith("a");
        System.out.println(endsssWithLetterU.test("Mithu"));

        // 2nd way
        Predicate<String> endssssWithLetterU = x -> x.toLowerCase().charAt(x.length() - 1) == 'a';
        System.out.println(endssssWithLetterU.test("Mithu"));


    }
}
