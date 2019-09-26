package test;

import com.company.Person;
import com.company.PersonController;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    PersonController personController = new PersonController();

    @Test
    public void checkPersons()
    {

        List<Person> results ;
        results = personController.getPersons();

        System.out.println(results.size());

        List<String> persons = new ArrayList<>();

        persons = results.stream().map(i -> i.getName()).collect(Collectors.toList());
//        for(int i =0 ; i< results.size(); i++)
//        {
//           persons.add(results.get(i).getName());
//
//        }
        System.out.println(persons);
//        persons.add("Supraja");
//        persons.add("Payal");

       assertEquals(3,results.size());
      //assertIterableEquals( , persons);

    }

    @Test
    public void checkSortByName()
    {
        personController.sortByName();
    }
}

