package org.example.ex16;

import java.util.function.Function;

public class FunctionConcept2 {
    public static void main(String[] args) {
        Function<String,String> get1st3Letters = x->x.substring(0,3);
        String result = get1st3Letters.apply("Mithu");
        System.out.println(result);
    }
}
