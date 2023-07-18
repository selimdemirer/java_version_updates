package com.cydeo.tasks.flatMapTasks;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){

        return Stream.of(
                new Employee(100,"Mike", "mike@cydeo.com", Arrays.asList("21212155","2132116556")),
                new Employee(101,"Ozzy", "ozzy@cydeo.com", Arrays.asList("21245678955","21327897")),
                new Employee(102,"Selim", "selim@cydeo.com", Arrays.asList("2178544565","27897897896"))
        );

    }
}
