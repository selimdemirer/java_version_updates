package com.cydeo.tasks.transactionTask;



import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {

    public static void main(String[] args) {

        System.out.println("1- Find all transactions in 2011 and sort by value");
        TransactionData.getAll().stream()
                .filter(p-> p.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("2- What are all the unique cities where the traders work?");
        TransactionData.getAll().stream()
                .map(f -> f.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("3- Find all traders from Cambridge and sort them by name");
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(p -> p.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("4- Return a string of all trader's names sorted alphabetically");
        String names = TransactionData.getAll().stream()
                .map(f->f.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(n1,n2)-> n1+n2+" ");
        System.out.println(names);

        System.out.println("//5- Are any traders based in Milan?");
        boolean isMilan = TransactionData.getAll().stream()
                .anyMatch(p->p.getTrader().getCity().equalsIgnoreCase("Milan"));
        System.out.println(isMilan);

        System.out.println("6- Print the sum of values of all transactions from the traders living in Cambridge");
        int totalCambridgeValue = TransactionData.getAll().stream()
                .filter(p->p.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .map(f->f.getValue())
                .reduce(0,(a,b)->a+b);
        System.out.println(totalCambridgeValue);

        System.out.println("7 - What is the highest value of all the transactions");
        Optional<Integer> high = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(high.get());

        System.out.println("8-Find the transaction with the smallest value");
        Optional<Transaction> smallestValue = TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));
        System.out.println(smallestValue.get());















    }

}
