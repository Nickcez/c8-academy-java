package com.bptn.course._Test;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> nums=new LinkedList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        set(3, 42);
        System.out.println(nums);
    }
}
