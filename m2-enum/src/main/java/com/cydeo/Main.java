package com.cydeo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("How to access a constant?");
        Currency c = Currency.DIME;
        System.out.println(c);//if it wouldn't be an enum, we got hash code (memory space name)
        System.out.println(Currency.PENNY);

        System.out.println("How to get all constants");
        Currency[] currencies = Currency.values();
        System.out.println(Arrays.toString(currencies));
        // or
        for (Currency each : currencies) {
            System.out.println(each);
        }

        System.out.println("How to use switch-case with enums");
        switch (Currency.PENNY){ //or we can type "c" only. it provides accessing the objects/constants
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }

    }

    private static void calculate(double x,double y,Operation operation){

        switch (operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
        }

    }





}
