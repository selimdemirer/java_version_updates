package com.cydeo;

public enum Currency {

    PENNY(1),NICKLE(5),DIME(10),QUARTER(25) ; // Everything you put in the enum is a "Constant Object of This Enum Class"

    private int value;

    Currency (int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
