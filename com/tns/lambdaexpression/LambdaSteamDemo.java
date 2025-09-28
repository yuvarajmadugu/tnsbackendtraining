package com.tns.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class LambdaSteamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,6,8,11,9,7,5,34);

        numbers.stream()
                .filter(n -> n%2 == 0) //lambda prediction //filtering even numbers from the list
                .map(n -> n*n) //lambda function
                .forEach(n -> System.out.println("Sqaure: " +n));
    }
}
