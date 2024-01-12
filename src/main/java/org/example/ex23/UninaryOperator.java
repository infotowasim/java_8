package org.example.ex23;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UninaryOperator {
    public static void main(String[] args) {

        //
        Function<Integer, Integer> integerFunction = x -> x * x;
        System.out.println(integerFunction.apply(5));

        // Uninary Operator
        UnaryOperator<Integer> integerUnaryOperator = y -> y * y;
        System.out.println(integerUnaryOperator.apply(10));

        //
        Function<String, String> stringFunction = str -> str.toUpperCase();
        System.out.println(stringFunction.apply("mithu"));

        // Uninary Operator
        UnaryOperator<String> stringUnaryOperator = strr -> strr.toUpperCase();
        System.out.println(stringUnaryOperator.apply("wasim"));


    }
}
