package org.example.ex20;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateee {
    public static void main(String[] args) {

        Predicate<Integer> integerPredicate = x->x%2==0;
        System.out.println(integerPredicate.test(10));


        //
        BiPredicate<Integer,Integer> biPredicate = (x,y)-> x%2==0 && y%2==0;
        System.out.println(biPredicate.test(10,20));

        //
        BiPredicate<String,Integer> stringIntegerBiPredicate = (str,x)-> str.length()==x;
        System.out.println(stringIntegerBiPredicate.test("Mithu",5));

        //
        BiPredicate<String,String> stringBiPredicate = (str1,str2)-> str1.length()==str2.length();
        System.out.println(stringBiPredicate.test("Mithu","Wasim"));

        //
        BiPredicate<Integer,String> Bipredicate = (x,str11)-> x==str11.length();
        System.out.println(Bipredicate.test(6,"Mithun"));

    }
}
