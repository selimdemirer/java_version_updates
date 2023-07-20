package com.cydeo.java9;

import java.util.ArrayList;
import java.util.Scanner;

public class ModuleDemo {

    public static void main(String[] args) {

        System.out.println(String.class.getModule());
        System.out.println(Scanner.class.getModule());
        System.out.println(ArrayList.class.getModule());


    }
}
