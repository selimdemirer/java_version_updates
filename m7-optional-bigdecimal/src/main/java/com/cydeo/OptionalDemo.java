package com.cydeo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,4,2,10,23);

        System.out.println("empty() - isPresent() methods:");
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());


        System.out.println(".of method:");
        Optional.of(number);       // We converted the "number" to Optional. After this operation we can use optional methods
        System.out.println(Optional.of(number).isPresent());


        System.out.println("ifPresent method:");
        Optional<Integer> bigNumber = number.stream().filter(x->x>100).findAny();
        bigNumber.ifPresent(System.out::println);

        System.out.println("get method:");
        //System.out.println(bigNumber.get());

        System.out.println("or/else method:");
        System.out.println(bigNumber.orElse(5));





    }
}
