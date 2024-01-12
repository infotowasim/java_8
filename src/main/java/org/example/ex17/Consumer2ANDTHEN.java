package org.example.ex17;

import org.example.Main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer2ANDTHEN {
    public static void main(String[] args) {


        //
        Consumer<List<Integer>> listConsumer1 = li->{
            for (Integer i : li){
                System.out.println(i);
            }
        };

        Consumer<List<Integer>> listConsumer2 = list->{
            for (Integer ii : list){
                System.out.println(ii+100);
            }
        };

        listConsumer1.andThen(listConsumer2).accept(Arrays.asList(1,2,3,4,5,6,7,8,9,10));



        //
        Consumer<List<String>> listConsumer11 = x->{
            for (String s : x){
                System.out.println(s);
            }
        };

        Consumer<List<String>> listConsumer22 = y->{
            for (String ss : y){
                System.out.println(ss+ " is the rocking guy");
            }
        };

        listConsumer11.andThen(listConsumer22).accept(Arrays.asList("Mithu","Sabnam","Wasim"));


    }
}
