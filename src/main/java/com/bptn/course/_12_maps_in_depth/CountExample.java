package com.bptn.course._12_maps_in_depth;

import java.util.Arrays;
import java.util.List;

public class CountExample {

    public static void main(String[] args) {


        //create a list of strings
        List<String> words=Arrays.asList("apple","banana","cherry","date","elderberry");

        //Count on the number of elements in the list
        //count() terminal operation on the stream of strings
        long count=words.stream().count();

        //Print the count
        System.out.println("Numbers of words in the list: " + count);


    }

}
