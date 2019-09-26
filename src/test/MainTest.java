package test;

import com.company.Main;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();
    @Test
    public void checkForMultiplesOf3And5below10()
    {

        List<Integer> results = main.listMultiplesOf3And5();
       // List<Integer> multiples = new ArrayList<>();

//        multiples.add(3);
//        multiples.add(5);
//        multiples.add(6);
//        multiples.add(9);
//        assertEquals(results,multiples);
        //for checking for multiples below the large
        assertTrue(results.contains(39));
    }
@Disabled
    @Test
    public void checkForSumOfMultiples3And5()
    {

        int sum = main.sumOfMultiples3And5();

        assertEquals(sum,23);
    }
}