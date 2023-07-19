package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;
        System.out.println(amount1-amount2); //0,30

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");
        BigDecimal b3 = BigDecimal.valueOf(374.56); // or we can create BigDecimal with valueOf method


        // System.out.println(b1-b2); we cannot use this formula because b1 and b2 are objects
        System.out.println(b1.subtract(b2));
        System.out.println(b1.add(BigDecimal.TEN));
        System.out.println(b1.multiply(new BigDecimal("1.58")));
        System.out.println(b1.multiply(BigDecimal.valueOf(1.58)));

        //Scaling
        BigDecimal number1 = new BigDecimal("23.12");
        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        System.out.println(number1.setScale(1,RoundingMode.FLOOR));
        System.out.println(number1.setScale(2,RoundingMode.FLOOR));
        System.out.println(number1.setScale(2,RoundingMode.CEILING));

        //Do not use equals(). Use compareTo()
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("1").compareTo(new BigDecimal("2")));

    }

    class Employee{

        private String name;
        // private double salary;
        private BigDecimal salary; //from now on we won't use double


    }
}
