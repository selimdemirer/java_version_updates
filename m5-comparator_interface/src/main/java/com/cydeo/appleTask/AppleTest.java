package com.cydeo.appleTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        //Ascending
        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);

        //Descending
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        //Chaining
        inventory
                .sort(comparing(Apple::getWeight)
                        .reversed().thenComparing(Apple::getColor));


    }

}