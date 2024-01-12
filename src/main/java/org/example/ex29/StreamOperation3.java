package org.example.ex29;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation3 {
    public static void main(String[] args) {
        Integer integer = Stream.iterate(0, x -> x + 1).limit(101).map(x -> x / 10).distinct().max((a, b) -> a-b).get();
        System.out.println(integer);

        Integer integer1 = Stream.iterate(0, x -> x + 1).limit(101).map(x -> x / 10).distinct().max((a, b) -> b-a).get();
        System.out.println(integer1);


        long count = Stream.iterate(0, x -> x + 1).limit(101).map(x -> x / 20).distinct().count();
        System.out.println(count);
    }
}
