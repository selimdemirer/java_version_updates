package com.cydeo.intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,1,3,3,2,4);
        list.forEach(System.out::println);

        System.out.println("Filter");
        list.stream()
                .filter(i -> i%2==0 )
                .forEach(System.out::println);

        System.out.println("Distinct");
        list.stream()
                .filter(i->i%2==0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("Limit");
        list.stream()
                .filter(i->i%2==0)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("Skip");
        list.stream()
                .filter(i->i%2==0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("Map");
        list.stream()
                .map(n -> n*3 )
                .filter(i->i%2==0)
                .forEach(System.out::println);








    }
}
