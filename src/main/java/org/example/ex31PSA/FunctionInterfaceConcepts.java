package org.example.ex31PSA;


// It takes 1 input, and then it generate an output.


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInterfaceConcepts {
    public static void main(String[] args) {

        // 1st way - given string it will give the length of that string
        Function<String, Integer> function1 = str -> str.length();
        System.out.println(function1.apply("Mithu")); // 5

        // 2nd way - given string it will give the length of that string
        Function<String, Integer> function2 = String::length; // using method Reference to replace of lambda expression.
        System.out.println(function2.apply("Sabnam")); //6

        // add externally number with given number
        Function<Integer, Integer> function3 = i -> i + 10;
        System.out.println(function3.apply(1)); // 1+10=11

        // 1st way - Converts all of the characters in this String to upper case
        Function<String, String> function4 = str -> str.toUpperCase();
        System.out.println(function4.apply("mithu is a good person"));

        // 2nd way - Converts all of the characters in this String to upper case
        Function<String, String> function5 = String::toUpperCase;
        System.out.println(function5.apply("sabnam is a cute girl"));

        // 1st way - Converts all of the characters in this String to lower case
        Function<String, String> function6 = str -> str.toLowerCase();
        System.out.println(function6.apply("WASIM IS A BAD GUY"));

        // 2ND way - Converts all of the characters in this String to lower case
        Function<String, String> function7 = String::toLowerCase;
        System.out.println(function7.apply("SABANA IS A GREAT GIRL"));



        // Example 1: Convert Integer to String
        Function<Integer, String> integerToString = n -> String.valueOf(n);

        int number = 42;
        String result = integerToString.apply(number);
        System.out.println("Example 1: Integer to String - Result: " + result);



        // Example 1: Convert Integer to String
        Function<Integer, String> integerToString1 = String::valueOf;

        int number1 = 55;
        String result1 = integerToString.apply(number);
        System.out.println("Example 1: Integer to String - Result: " + result);



        // Example 2: Multiply Integer by 2 and convert to String
        Function<Integer, String> multiplyByTwoToString = n -> String.valueOf(n * 2);

        int inputNumber = 5;
        String multipliedResult = multiplyByTwoToString.apply(inputNumber);
        System.out.println("Example 2: Multiply by 2 and Convert to String - Result: " + multipliedResult);


        // Sorted Integer
        List<Integer> integerList = Arrays.asList(1, 5, 3, 7, 9, 2, 3, 4, 0, 100, 34, 5, 656, 87, 65, 9, 87, 56);
        List<Integer> sortedList = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);


        // Sorted String
        List<String> stringList11 = Arrays.asList("Mithu", "Mike", "Mithun", "Mike", "Mubarak", "Wasim", "Sabnam", "Mike", "Sumaiya", "Rohini");
        List<String> sortedListString = stringList11.stream().sorted().toList();
        System.out.println(sortedListString);

        // Inverse Sorted Integer
        List<Integer> integerList1 = Arrays.asList(1, 5, 3, 7, 9, 2, 3, 4, 0, 100, 34, 5, 656, 87, 65, 9, 87, 56);
        List<Integer> InverseSortedListInteger = integerList1.stream().sorted((a, b) -> b - a).toList();
        System.out.println(InverseSortedListInteger);


        // Inverse Sorted String
        List<String> stringList = Arrays.asList("Mithu", "Mike", "Mithun", "Mike", "Mubarak", "Wasim", "Sabnam", "Mike", "Sumaiya", "Rohini");
        List<String> InverseSortedListString = stringList.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println(InverseSortedListString);


        // Distinct means remove duplicate value
        List<Integer> integerListt = Arrays.asList(1, 5, 3, 7, 9, 2, 3, 4, 0, 100, 34, 5, 656, 87, 65, 9, 87, 56);
        List<Integer> removeDuplicateValue = integerListt.stream().distinct().toList();
        System.out.println(removeDuplicateValue);


        // Distinct means remove duplicate String
        List<String> stringListt = Arrays.asList("Mithu", "Mike", "Mithun", "Mike", "Mubarak", "Wasim", "Sabnam", "Mike", "Sumaiya", "Rohini");
        List<String> removeDuplicateString = stringListt.stream().distinct().toList();
        System.out.println(removeDuplicateString);


    }
}
