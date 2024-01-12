package org.example.ex16;

import java.util.function.Function;

public class FunctionConcept4ANDTHEN {
    public static void main(String[] args) {

        Function<String,String> upperCase = x->x.toUpperCase();
        Function<String,String> get1st3Letters = y->y.substring(0,3);

//        Function<String, String> stringStringFunction = upperCase.andThen(get1st3Letters);
//        String result = stringStringFunction.apply("Mithu");
//        System.out.println(result);

        System.out.println(upperCase.andThen(get1st3Letters).apply("Mithu"));
    }
}
