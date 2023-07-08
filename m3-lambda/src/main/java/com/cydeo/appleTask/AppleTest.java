package com.cydeo.appleTask;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        List<Apple> heavyApple = filterApples(inventory,new AppleHeavyPredicate());
        System.out.println(heavyApple);
        List<Apple> greenApple = filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(greenApple);

        System.out.println("------------------------------------------------------------------------");

        // Lambda Solution:
        System.out.println(filterApples(inventory,apple -> apple.getWeight()>200));

    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){

        List<Apple> result = new ArrayList<>();

        for(Apple each : inventory){
            if (applePredicate.test(each)){
                result.add(each);
            }
        }

        return result;

    }


}
