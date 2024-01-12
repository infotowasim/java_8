package org.example.ex15;

import java.util.function.Predicate;

public class PredicateConcept8NAGATE {
    public static void main(String[] args) {
        // 1st way False
        Predicate<String> startWithLetterM = x -> x.toLowerCase().charAt(0) == 'm';
        Predicate<String> endsWithLetterU = x -> x.toLowerCase().charAt(x.length() - 1) == 'g';
        Predicate<String> nagate1 = startWithLetterM.negate().and(endsWithLetterU);
        System.out.println(nagate1.test("Mithu"));


        // 1st way False
        Predicate<String> starttWithLetterM = x -> x.toLowerCase().charAt(0) == 'x';
        Predicate<String> endssWithLetterA = x -> x.toLowerCase().charAt(x.length() - 1) == 'z';
        Predicate<String> negate2 = starttWithLetterM.negate().and(endssWithLetterA);
        System.out.println(negate2.test("Mithu"));


        // 2nd way False
        Predicate<String> startttWithLetterM = x -> x.toLowerCase().startsWith("m");
        Predicate<String> endsssWithLetterU = x -> x.toLowerCase().endsWith("k");
        Predicate<String> negate3 = startttWithLetterM.negate().and(endsssWithLetterU);
        System.out.println(negate3.test("Mithu"));


        // 2nd way True
        Predicate<String> starttttWithLetterM = x -> x.toLowerCase().startsWith("l");
        Predicate<String> endssssWithLetterA = X -> X.toLowerCase().endsWith("k");
        Predicate<String> negate4 = starttttWithLetterM.negate().or(endssssWithLetterA);
        System.out.println(negate4.test("Mithu"));

        // False
        Predicate<String> startttttWithLetterM = x -> x.toLowerCase().startsWith("m");
        Predicate<String> endsssssWithLetterA = X -> X.toLowerCase().endsWith("k");
        System.out.println(startttttWithLetterM.negate().test("Mithu"));

         // True
        Predicate<String> starttttttWithLetterM = x -> x.toLowerCase().startsWith("l");
        Predicate<String> endssssssWithLetterA = X -> X.toLowerCase().endsWith("a");
        System.out.println(endssssssWithLetterA.negate().test("Mithu"));



    }
}

