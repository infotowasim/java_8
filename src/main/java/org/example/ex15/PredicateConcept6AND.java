package org.example.ex15;

import java.util.function.Predicate;

public class PredicateConcept6AND {
    public static void main(String[] args) {

        // 1st way True
        Predicate<String> startWithLetterM = x -> x.toLowerCase().charAt(0) == 'm';
        Predicate<String> endsWithLetterU = x -> x.toLowerCase().charAt(x.length() - 1) == 'u';
        Predicate<String> and1 = startWithLetterM.and(endsWithLetterU);
        System.out.println(and1.test("Mithu"));


        // 1st way False
        Predicate<String> starttWithLetterM = x -> x.toLowerCase().charAt(0) == 'm';
        Predicate<String> endssWithLetterA = x -> x.toLowerCase().charAt(x.length() - 1) == 'a';
        Predicate<String> and2 = starttWithLetterM.and(endssWithLetterA);
        System.out.println(and2.test("Mithu"));


        // 2nd way True
        Predicate<String> startttWithLetterM = x -> x.toLowerCase().startsWith("m");
        Predicate<String> endsssWithLetterU = x -> x.toLowerCase().endsWith("u");
        Predicate<String> and3 = startttWithLetterM.and(endsssWithLetterU);
        System.out.println(and3.test("Mithu"));


        // 2nd way False
        Predicate<String> starttttWithLetterM = x -> x.toLowerCase().startsWith("m");
        Predicate<String> endssssWithLetterA = X -> X.toLowerCase().endsWith("a");
        Predicate<String> and4 = starttttWithLetterM.and(endssssWithLetterA);
        System.out.println(and4.test("Mithu"));

    }
}

