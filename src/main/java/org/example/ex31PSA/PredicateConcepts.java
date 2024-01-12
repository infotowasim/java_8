package org.example.ex31PSA;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


// Predicate is a functional interface that takes input and produces a boolean value like true or false.


public class PredicateConcepts {
    public static void main(String[] args) {

        // INTEGER OF PREDICATE - TRUE
        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println(predicate.test(10));

        // INTEGER OF PREDICATE - FALSE
        Predicate<Integer> integerPredicate = x -> x % 2 == 0;
        System.out.println(integerPredicate.test(11));

        // 1 st way - STRING OF PREDICATE - TRUE
        Predicate<String> predicate1 = str -> true;
        System.out.println(predicate1.test("Mithu"));

        // 2nd way- STRING OF PREDICATE - TRUE
        Predicate<String> stringPredicate1 = str -> str.equals("Mithu");
        System.out.println(stringPredicate1.test("Mithu"));

        // 1st way - STRING OF PREDICATE - FALSE
        Predicate<String> stringPredicate = str -> false;
        System.out.println(stringPredicate.test("Mithu"));

        // 2nd way- STRING OF PREDICATE - FALSE
        Predicate<String> stringPredicate2 = str -> str.equals("Mithu");
        System.out.println(stringPredicate2.test("Wasim"));

        // 1st way - EVEN NUMBER USING PREDICATE
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collectEvenNumber = integerList.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(collectEvenNumber);

        // 2nd way - EVEN NUMBER USING PREDICATE FILTER AND STREAM
        List<Integer> integerList1 = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);
        List<Integer> collectEvenNumber1 = integerList1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collectEvenNumber1);

        // 1st way - ODD NUMBER USING PREDICATE FILTER AND STREAM
        List<Integer> integerList2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collectOddNumber = integerList2.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println(collectOddNumber);


        // 2nd way - ODD NUMBER USING PREDICATE FILTER AND STREAM
        List<Integer> integerList3 = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);
        List<Integer> collectOddNumber1 = integerList3.stream().filter(x -> x % 2 != 0).toList();
        System.out.println(collectOddNumber1);


        // 1st way - Give me the names whose starting name starting latter should be start with m
        List<String> stringList = Arrays.asList("Mithu", "Mike", "Mithun", "Mubarak", "Wasim", "Sabnam", "Sumaiya", "Rohini");
        List<String> startWithLatterM = stringList.stream().filter(str -> str.startsWith("M")).toList();
        System.out.println(startWithLatterM);

        // 1st way - Give me the names whose starting name starting latter should be start with m
        List<String> stringList1 = Arrays.asList("Mithu", "Mike", "Mithun", "Mubarak", "Wasim", "Sabnam", "Sumaiya", "Rohini");
        List<String> startWithLatterM1 = stringList1.stream().filter(x -> x.startsWith("M")).collect(Collectors.toList());
        System.out.println(startWithLatterM1);


        // 1st way - How many times mike occurs in the given collections
        List<String> stringList11 = Arrays.asList("Mithu", "Mike", "Mithun", "Mike", "Mubarak", "Wasim", "Sabnam", "Mike", "Sumaiya", "Rohini");
        List<String> howManyTimesMikeOccurs = stringList11.stream().filter(x -> x.equals("Mike")).collect(Collectors.toList());
        System.out.println(howManyTimesMikeOccurs);

        // 2nd way - How many times mike occurs in the given collections
        List<String> stringList111 = Arrays.asList("Mithu", "Mike", "Mithun", "Mike", "Mubarak", "Wasim", "Sabnam", "Mike", "Sumaiya", "Rohini");
        List<String> howManyTimesMikeOccurs1 = stringList111.stream().filter(str -> str.equals("Mike")).toList();
        System.out.println(howManyTimesMikeOccurs1);

        // 1ST WAY - GIVES ME THE NAMES WHOSE ENDS LATTER SHOULD BE END WITH U
        List<String> stringList2 = Arrays.asList("Mithu", "Mike", "Mithun", "Mike", "Mubarak", "Wasim", "Sabnam", "Mike", "Sumaiya", "Rohini");
        List<String> endsWithLatterU1 = stringList2.stream().filter(x -> x.endsWith("u")).collect(Collectors.toList());
        System.out.println(endsWithLatterU1);


        // 1ST WAY - GIVES ME THE NAMES WHOSE ENDS LATTER SHOULD BE END WITH U
        List<String> stringList22 = Arrays.asList("Mithu", "Mike", "Mithun", "Mike", "Mubarak", "Wasim", "Sabnam", "Mike", "Sumaiya", "Rohini");
        List<String> endsWithLatterU11 = stringList2.stream().filter(x -> x.endsWith("u")).toList();
        System.out.println(endsWithLatterU11);


    }

}
