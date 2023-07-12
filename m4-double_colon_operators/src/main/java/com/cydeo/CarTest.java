package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        // No Args Constructor
        Supplier<Car> c1 = () -> new Car(); // Normal lambda way
        System.out.println(c1.get().getModel()); // get() is method of "Supplier" functional interface
        Supplier<Car> c2 = Car::new; // Double colon operator way
        System.out.println(c2.get().getModel()); // get() is method of "Supplier" functional interface

        // One Argument Constructor
        Function<Integer,Car> f1 = model -> new Car(model);// Normal lambda way
        Function<Integer,Car> f2 = Car::new;// Double colon operator way

        // All Args Constructor
        BiFunction<String,Integer,Car> a1 = (make, model) -> new Car(make,model); // Normal lambda way
        BiFunction<String,Integer,Car> a2 = Car::new; // Double colon operator way
        Car honda = a2.apply("Honda",2015); // apply() is method of "BiFunction" functional interface
        System.out.println(honda.getMake()+" "+honda.getModel());

    }

}
