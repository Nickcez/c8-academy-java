package com.bptn.course._14_search_in_depth;

import java.util.Arrays;

public class BubbleSortExample {

    public static int[] bubbleSort(int[] myArray) {


        int temp = 0;  //  temporary element for swapping

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 1; j < (myArray.length - i); j++) {
                if (myArray[j - 1] > myArray[j]) {
                    //  swap array’s elements using temporary element
                    temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }


        return myArray;
    }



    public static void main(String[] args) {
        int arr[] = {8, 7, 1, 2, 5};


        System.out.println("Array arr Before Bubble Sort");

        System.out.println(Arrays.toString(arr));


        System.out.println("Array arr After Bubble Sort");
        System.out.println(Arrays.toString(bubbleSort(arr)));


    }
}
