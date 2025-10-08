package com.bptn.course._12_maps_in_depth;

import java.util.HashSet;
import java.util.Set;

public class HashSetMani {
    public static void main(String[] args) {
        // Create a HashSet and populate it with initial values
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");

        // Print the size of the set
        System.out.println("Set size: "+set.size());

        // Use for loop to print the values in the set
        for(String item:set) {
            System.out.println("Value: "+item);
        }
        // Use add() method to add a new value to the set
        set.add("D");
        System.out.println("Set after using add(): ");
        for(String item:set) {
            System.out.println("Value: "+item);
        }

        // Use remove() method to remove a value from the set
        set.remove("A");
        System.out.println("Set after using remove(): ");
        for(String item:set) {
            System.out.println("Value: "+item);
        }

        // Use contains() method to check if the value "C" exists in the set
        if(set.contains("C")) {
            System.out.println("Value 'C' exists in the set.");
        } else {
            System.out.println("Value 'C' does not exist in the set.");
        }

    }
}
