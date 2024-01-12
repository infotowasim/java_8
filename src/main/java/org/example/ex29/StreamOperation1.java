package org.example.ex29;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation1 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 234, 567, 11, 0, 9, 8, 7);
        integerList.stream()
                .filter(x -> x % 2 == 0)
//                .peek(System.out::println)
                .sorted((a,b)-> b-a)
                .distinct()
//                .peek(System.out::println)
                .map(x->x/2)
                .distinct()
                .limit(4)
                .skip(1)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
