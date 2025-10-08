package com.bptn.course._12_maps_in_depth;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango", "Grapes");

        // Filtering fruits starting with "A"
        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .toList();

        System.out.println("Filtered fruits: " + filteredFruits);
    }
}
