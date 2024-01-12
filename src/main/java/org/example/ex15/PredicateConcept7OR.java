package org.example.ex15;

import java.util.function.Predicate;

public class PredicateConcept7OR {
    public static void main(String[] args) {
        // 1st way True
        Predicate<String> startWithLetterM = x -> x.toLowerCase().charAt(0) == 'm';
        Predicate<String> endsWithLetterU = x -> x.toLowerCase().charAt(x.length() - 1) == 'g';
        Predicate<String> or1 = startWithLetterM.or(endsWithLetterU);
        System.out.println(or1.test("Mithu"));


        // 1st way False
        Predicate<String> starttWithLetterM = x -> x.toLowerCase().charAt(0) == 'x';
        Predicate<String> endssWithLetterA = x -> x.toLowerCase().charAt(x.length() - 1) == 'z';
        Predicate<String> or2 = starttWithLetterM.or(endssWithLetterA);
        System.out.println(or2.test("Mithu"));


        // 2nd way True
        Predicate<String> startttWithLetterM = x -> x.toLowerCase().startsWith("m");
        Predicate<String> endsssWithLetterU = x -> x.toLowerCase().endsWith("k");
        Predicate<String> or3 = startttWithLetterM.or(endsssWithLetterU);
        System.out.println(or3.test("Mithu"));


        // 2nd way False
        Predicate<String> starttttWithLetterM = x -> x.toLowerCase().startsWith("l");
        Predicate<String> endssssWithLetterA = X -> X.toLowerCase().endsWith("k");
        Predicate<String> or4 = starttttWithLetterM.or(endssssWithLetterA);
        System.out.println(or4.test("Mithu"));

    }
}

