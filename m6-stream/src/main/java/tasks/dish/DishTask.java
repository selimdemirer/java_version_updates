package tasks.dish;

import java.util.Comparator;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {

        // DishData.getAll(); -> is giving the collections

        System.out.println("Print all dish’s name that has less than 400 calories");
        DishData.getAll().stream()
                .filter(p->p.getCalories()<400)
                //.map(dish-> dish.getName()) //Lambda
                .map(Dish::getName) //Double Colon
                .forEach(System.out::println);


        System.out.println("Print the length of the name of each dish");
        DishData.getAll().stream()
                .map(l-> l.getName().length())
                .forEach(System.out::println);
        /*
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);
        */


        System.out.println("Print three high caloric dish name (>300)");
        DishData.getAll().stream()
                .filter(p->p.getCalories()>300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);


        System.out.println("Print all dish’s name that are below 400 calories in sorted");
        DishData.getAll().stream()
                .sorted(comparing(Dish::getCalories))
                .filter(p->p.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);

        Stream<Dish> dishStream = DishData.getAll().stream(); //Creating stream


    }
}
