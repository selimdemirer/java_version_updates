package com.cydeo;

public enum Operation {

    PLUS,MINUS,MULTIPLY,DIVIDE; //each constant is object of Operation. If we run main method, constructor will executed four times.

    private Operation() { //this constructor cannot be public, it is private. Because you cannot call this constructor manually. It is not for "new". We don't need to initialize new object.
        System.out.println("Constructor");
    }




}
