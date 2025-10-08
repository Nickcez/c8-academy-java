package com.bptn.course._12_maps_in_depth;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");

        // Printing each fruit using the forEach method
        fruits.stream()
                .forEach(System.out::println);
    }

    // Traditional way of Printing. Uncomment to run the code below
    // for (String fruit: fruits){
    //     System.out.println(fruit);
    // }


}


