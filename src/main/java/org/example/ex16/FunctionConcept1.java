package org.example.ex16;

import java.util.function.Function;

public class FunctionConcept1 {
    public static void main(String[] args) {

        Function<String, Integer> getLength = x->x.length();
        Integer result = getLength.apply("Mithu");
        System.out.println(result);
    }
}
