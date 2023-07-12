package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Calculate sum1 = (x, y) -> System.out.println(x+y); //Lambda

        Calculate sum2 = (x, y) -> Calculator.findSum(x,y); //Lambda with static method

        //Reference to a Static Method
        Calculate sum3 = Calculator::findSum;
        sum3.calculate(10,20);

        System.out.println("=========================================================");

        Calculate multi1 = (x, y) -> System.out.println(x*y); //Lambda

        Calculator obj = new Calculator();
        Calculate multi2 = (x, y) -> obj.findMultiply(x, y); //Lambda with instance method

        //Reference to an Instance Method
        Calculate multi3 = obj::findMultiply;
        obj.findMultiply(20,30);


        BiFunction<String,Integer,String> func1 = (str,i) -> str.substring(i);
        BiFunction<String,Integer,String> func2 = String::substring;

        //Reference to an Instance Method
        Function <Integer,Double> b = new MyClass()::method; // we can use the double colon op after "obj"
        BiFunction<MyClass,Integer,Double> b1 = MyClass::method; // we can use the double colon op after class name for same instance method. Because "obj" belongs to this class.

        Consumer<Integer> display1 = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;










    }

}
