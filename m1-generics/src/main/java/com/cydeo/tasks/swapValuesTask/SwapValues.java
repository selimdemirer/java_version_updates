package com.cydeo.tasks.swapValuesTask;

import java.util.Arrays;

public class SwapValues {

    public static void main(String[] args) {

        Integer[] a = {1,2,3,4};
        swap(a,0,2);
        String[] b = {"Esra","Zehra","Zeynep"};
        swap(b,0,1);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }

    private static <T> void swap(T[] a, int i, int j){

              T temp = a[i];
                a[i] = a[j];
                a[j] = temp;

    }



}
