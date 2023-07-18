package com.cydeo.terminalOperations;

import com.cydeo.tasks.dishTasks.Dish;
import com.cydeo.tasks.dishTasks.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

        System.out.println("All Match");
        boolean isHealthy1 = DishData.getAll().stream().allMatch(p-> p.getCalories()<1000);
        System.out.println(isHealthy1);

        System.out.println("Any Match");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("None Match");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(p-> p.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println("Find Any");
        Optional<Dish> dish1 = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish1);

        System.out.println("Find First");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2);



        //PARALLEL STREAMS ()
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

        Optional<String> findFirst = list1.parallelStream().filter(s->s.startsWith("D")).findFirst(); //David
        Optional<String> findAny = list2.parallelStream().filter(s->s.startsWith("J")).findAny(); //Jill

        //Optional<String> findFirst = list1.stream().filter(s->s.startsWith("D")).findFirst(); //David
        //Optional<String> findAny = list2.stream().filter(s->s.startsWith("J")).findAny(); //Jhonny

        System.out.println(findFirst.get());
        System.out.println(findAny.get());



        System.out.println("Min");
        Optional<Dish> dMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get());

        System.out.println("Max");
        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax.get());





    }

}
