package org.example.ex21;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionnnn {
    public static void main(String[] args) {

        //
        Function<Integer, Integer> integerIntegerFunction = x -> x * x * x;
        System.out.println(integerIntegerFunction.apply(2));

        //
        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("Mithu"));


        //
        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x * 2 + y * 3;
        System.out.println(biFunction.apply(2, 3));

        //
        BiFunction<String,String,Integer> biFunction1 = (str1,str2)->str1.length() + str2.length();
        System.out.println(biFunction1.apply("Mithu","Roni"));

    }
}
