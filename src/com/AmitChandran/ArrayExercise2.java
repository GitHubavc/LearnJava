package com.AmitChandran;

import java.util.Arrays;
import java.util.Scanner;

/**
 * sum product and avg of the elements of an array
 */
public class ArrayExercise2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,-3,5,7};
        int sum= 0;
        int product = 1;
        double average;

        for(int i= 0 ; i<numbers.length;i++){
            sum += numbers[i];
            product *= numbers[i];
        }
        average= (double) sum /numbers.length;
        System.out.println("Sum: " +sum+ " Product: " +product+ " Average: " +average);

    }
}
