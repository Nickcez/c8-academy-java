package com.bptn.course._10_arrayList_in_depth;

import java.util.*;

public class ArrayTest {
    public static void main(String[] args){
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(25);
        values.add(73);
        values.add(14);
        values.add(85);
        values.add(9);

        values.set(3, 555);
        System.out.println(values);

        values.add(2, 5);
        System.out.println(values);

        values.add(777);
        System.out.println(values);

        values.remove(1);
        System.out.println(values);
    }
}
