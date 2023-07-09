package com.cydeo.employeeTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {

        Person p1 = new Person("mike",35,Gender.MALE);
        Person p2 = new Person("ozzy",25,Gender.MALE);
        Person p3 = new Person("muhtar",15,Gender.MALE);
        Person p4 = new Person("icell",45,Gender.FEMALE);

        List<Person> personList = Arrays.asList(p1,p2,p3,p4);

        CheckMember checkMember =p -> p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge()<=25;

        print(personList,checkMember);

    }

    private static void print(List<Person> personlist, CheckMember checkMember){

        List<Person> result = new ArrayList<>();
        for (Person each : personlist) {
            if (checkMember.test(each)){
                result.add(each);
            }
        }
        System.out.println(result);
    }


}
