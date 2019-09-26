package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer> result = new ArrayList<>();

    public List<Integer> listMultiplesOf3And5() {

        for(int i =3 ; i<100 ; i++)
        {
            if( i % 3 == 0 || i % 5 == 0)
            {
                result.add(i);
            }
            else
            {
                continue;
            }
        }

        System.out.println(result);
        return result;
    }

    public int sumOfMultiples3And5() {

        int sum=0;
        System.out.println(result.size());
        for(int i = 0; i< result.size() ; i++)
        {
            sum =sum+result.get(i);
        }
        System.out.println(sum);
        return  sum;
    }
}
