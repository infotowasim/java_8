package org.example.ex28;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TypeOfCreatingStream5Way {
    public static void main(String[] args) {

        // Using Array
       String[] array= {"Mithu","Sabnam","Wasim","Sumaiya"};
        Stream<String> stream1 = Arrays.stream(array);

        // Using List
        List<String> stringList = Arrays.asList("Mithu", "Sabnam", "Wasim", "Sumaiya");
        Stream<String> stream2 = stringList.stream();

        // Using directly Stream
        Stream<String> stream3 = Stream.of("Mithu", "Sabnam", "Wasim", "Sumaiya");

        //
        Stream<Integer> stream4 = Stream.iterate(0, x -> x + 1).limit(100).skip(1);

        //
        Stream<String> stream5 = Stream.generate(() -> "Hello").limit(10);


    }
}
