package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class CarTest {

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota",140,1998));
        carList.add(new Car("Audi",200,2008));
        carList.add(new Car("BMW",210,2020));
        carList.add(new Car("Nissan",150,2018));

        System.out.println(filterFastCars(carList));
        System.out.println(filterNewCars(carList));

    }
    //Without behaviour parameterization
    private static List<Car> filterFastCars(List<Car> cars){

        List<Car> filteredCars = new ArrayList<>();
        for (Car each : cars){
            if(each.getTopSpeed()>160){
                filteredCars.add(each);
            }
        }

        return filteredCars;

    }

    private static List<Car> filterNewCars(List<Car> cars){

        List<Car> filteredCars = new ArrayList<>();
        for (Car each : cars){
            if(each.getYear()>2015){
                filteredCars.add(each);
            }
        }

        return filteredCars;

    }

    //With behaviour parameterization



}
