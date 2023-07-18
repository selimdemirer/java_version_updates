package com.cydeo.terminalOperations;

import com.cydeo.tasks.dishTasks.Dish;
import com.cydeo.tasks.dishTasks.DishData;
import com.cydeo.tasks.dishTasks.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        System.out.println("toCollection(Supplier): is used to create a Collection using Collectors");
        List<Integer> numberList = numbers.stream()
                .filter(x-> x%2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x-> x%2 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        System.out.println("toList(): returns a Collector interface that gathers the input data into a new List");
        List<Integer> numberList2 = numbers.stream()
               .filter(x-> x%2 == 0)
               .collect(Collectors.toList());
        System.out.println(numberList2);

        System.out.println("toSet(): returns a Collector interface that gathers the input data into a new Set");
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x-> x%2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        System.out.println("toMap(Function, Function): returns a Collector interface that gathers the input data into a new Map");
        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        System.out.println("summingInt(ToIntFuction): returns a Collector that produces the sum of an Integer-valued func");
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        System.out.println("counting(): returns a Collector that counts the number of elements");
        Long evenCount = numbers.stream()
                .filter(x-> x%2 == 0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        System.out.println("averagingInt(): returns a Collectors that calculate the average of the integers passed values");
        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAverage);

        System.out.println("joining(): is used to join various elements of a character or string array into a single object");
        List<String> courses = Arrays.asList("Java","JS","TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        System.out.println("partitioningBy(): is used to partition a stream of objects (or a set of elements) based on a given predicate");
        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        System.out.println("groupingBy(): is used for grouping objects by some property and storing results in a Map instance");
        Map<Type, List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);




    }
}
