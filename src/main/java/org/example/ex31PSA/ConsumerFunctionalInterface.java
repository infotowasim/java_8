package org.example.ex31PSA;


// it takes input but it does not produce output.


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    public static void main(String[] args) {

        // 1st way - Integer
        Consumer<Integer> integerConsumer1 = n-> System.out.println(n);
        integerConsumer1.accept(100);

        // 2nd way - Integer
        Consumer<Integer> integerConsumer2 = System.out::println;
        integerConsumer2.accept(23);

        // 1st way - String
        Consumer<String> stringConsumer1 = n-> System.out.println(n);
        stringConsumer1.accept("Mithu");

        // 2nd way - String
        Consumer<String> stringConsumer2 = System.out::println;
        stringConsumer2.accept("Sabnam");

        // 1st way - IntegerList
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Consumer<Integer> integerConsumer = n-> System.out.println(n);
        integerList.forEach(integerConsumer);


        // 2nd way - StringList
        List<String> stringList11 = Arrays.asList("Mithu", "Mike", "Mithun", "Mike", "Mubarak", "Wasim", "Sabnam", "Mike", "Sumaiya", "Rohini");
        Consumer<String> stringConsumer = System.out::println;
        stringList11.forEach(stringConsumer);


    }
}
