package com.bptn.course._Test;

public class Test {
    public static void main(String[] args) {
        try {
            //  Block of code to try
            int a = 11;
            int b = 0;
            System.out.print(a/b);
        } catch (ArithmeticException e) {
            //  Block of code to handle errors
            System.out.println("The number cannot be divided by zero");
        }
    }
}
