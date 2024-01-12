package org.example.ex22;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerrr {
    public static void main(String[] args) {
        Consumer<Integer> integerConsumer = x -> System.out.println(x);
        integerConsumer.accept(111);


        //
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x + y);
        biConsumer.accept(10,20);



    }
}
