package org.example.ex29;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation2 {
    public static void main(String[] args) {
        Stream.iterate(0, x -> x + 1)
                .limit(101)
                .skip(1)
                .filter(x -> x % 2 == 0)
//                .peek(System.out::println)
                .map(x -> x / 10)
//                .peek(System.out::println)
                .distinct()
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
