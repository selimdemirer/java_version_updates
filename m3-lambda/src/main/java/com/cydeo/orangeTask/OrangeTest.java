package com.cydeo.orangeTask;

import com.cydeo.appleTask.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100, Color.RED));
        inventory.add(new Orange(200, Color.GREEN));
        inventory.add(new Orange(50, Color.RED));

        OrangeFormatter orangeLambda = orange -> {
            if (orange.getWeight()<150){
                return "A light "+orange.getColor()+" orange         An orange of "+orange.getWeight()+"g";
            }else {
                return "A heavy "+orange.getColor()+" orange         An orange of "+orange.getWeight()+"g";
            }
        };

        prettyPrintOrange(inventory,orangeLambda);

    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for (Orange each : inventory){
            String output = orangeFormatter.accept(each);
            System.out.println(output);
        }
    }

// we need to pass our action somewhere (in the parameter of prettyPrintOrange method) and then we need to implement that action calling this method with LAMBDA!!!


}
