package com.bptn.course._12_maps_in_depth;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Alice");

        // Mapping names to uppercase using the map method
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("Uppercase names: " + uppercaseNames);
    }
}
