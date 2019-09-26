package com.company;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class PersonController {


    Person p1 = new Person(10,"Supraja",35,"Developer");
    Person p2 = new Person(11,"Sindhu",25,"Developer");
    Person p3 = new Person(12,"Payal",27,"Developer");

    static List<Person>  personList = new ArrayList<>();

    public List<Person> getPersons() {

//        result = moviesList.stream().filter(movie -> movie.getTitle().toUpperCase().contains(partialTitle.toUpperCase())).
//                map(movie-> movie.getTitle()).collect(Collectors.toList());

        List<String> result = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
         personList.stream().forEach(System.out::println);

        // System.out.println(personList.toString());
        return personList;
    }


    public void sortByName() {

       // List<Person> persons= personList.sort(Comparator.comparing((Person p) -> p.getName()));

    }
}
