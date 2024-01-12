package org.example.ex31PSA.question2;


// You have a list of Integer, your task is to filter out the even numbers,
// square each of them, and the find the sum of the square values.
// Explain How would you achieve this using filter, map and reduce operations in the java Stream API.


import java.util.Arrays;
import java.util.List;

public class StreamAPI2 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 10);
        Integer SumOfTheSquareValues = integerList.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(SumOfTheSquareValues);
    }
}
