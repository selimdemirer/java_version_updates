package com.cydeo.tasks.flatMapTasks;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println("Print all emails");
        EmployeeData.readAll() // this is already converted to stream because of "Stream.of()" ! No need to write ".stream()"!         //  .map(employee -> employee.getEmpEmail())
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("Print all phone numbers");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("or with Double Colon Operator");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);











    }
}
