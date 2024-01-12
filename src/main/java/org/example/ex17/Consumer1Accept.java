package org.example.ex17;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1Accept {
    public static void main(String[] args) {

        //
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Mithu");


        //
        Consumer<List<String>> listConsumer = li -> {
            for (String s : li) {
                System.out.println(s + " is The best");
            }
        };
        listConsumer.accept(Arrays.asList("Mithu", "Wasim", "Sabnam"));


        //
        Consumer<List<String>> listConsumer1 = li -> {
            for (String s : li) {
                System.out.println(s);
            }
        };
        listConsumer1.accept(Arrays.asList("Mithu", "Wasim", "Sabnam"));


        //
        Consumer<Integer> consumer1 = y -> System.out.println(y);
        consumer1.accept(100);


        //
        Consumer<List<Integer>> listConsumer2 = list -> {
            for (Integer i : list) {
                System.out.println(i);
            }
        };
        listConsumer2.accept(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));


        //
        Consumer<List<Integer>> listConsumer3 = ss -> {
            for (Integer ii : ss) {
                System.out.println(ii + 100);
            }
        };
        listConsumer3.accept(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
