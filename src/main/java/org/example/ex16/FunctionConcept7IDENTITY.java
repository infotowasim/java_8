package org.example.ex16;

import java.util.function.Function;

public class FunctionConcept7IDENTITY {
    public static void main(String[] args) {
        Function<String,String> functionIdentity = Function.identity();
        System.out.println(functionIdentity.apply("Mithu"));

    }
}
