package org.example.ex16;

import java.util.function.Function;

public class FunctionConcept6COMPOSE {
    public static void main(String[] args) {

        Function<Integer, Integer> function1 = x -> 2 * x;
        Function<Integer, Integer> function2 = x -> x * x * x;

        System.out.println(function1.compose(function2).apply(3)); // (54)-> 3*3*3=27, 2*27=54
        System.out.println(function2.compose(function1).apply(3)); // (216)-> 2*3=6, 6*6*6=216
    }
}
