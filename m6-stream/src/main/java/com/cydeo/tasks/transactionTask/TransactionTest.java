package com.cydeo.tasks.transactionTask;

import java.util.Comparator;

public class TransactionTest {

    public static void main(String[] args) {

        System.out.println("1- Find all transactions in 2011 and sort by value");
        TransactionData.getAll().stream()
                .filter(p-> p.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("2- What are all the unique cities where the traders work?");













    }

}
