package org.example.ex24;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOparator {
    public static void main(String[] args) {

        //
        BiFunction<String, String ,String> stringBiFunction = (str1,str2)-> str1+str2;
        System.out.println(stringBiFunction.apply("Hello ", "World"));

        // Binary Oparator
        BinaryOperator<String> stringBinaryOperator = (str1,str2)-> str1+str2;
        System.out.println(stringBinaryOperator.apply("I am ","the Best"));

    }
}
