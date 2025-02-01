package com.AmitChandran;

/**
 * min max in an array
 */
public class ArrayExercise4 {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,-3,5,-9,13,-2,1};
        minValue(numbers);
        maxValue(numbers);
    }
    public static void minValue(int[] numbers){
        int min = numbers[0];
        for(int i = 0; i<numbers.length; i++)
            if(numbers[i]<numbers[0])
                min=numbers[i];
        System.out.println("Minimum value : " +min);

    }
    public static void maxValue(int[] numbers){
        int max = numbers[0];
        for(int i = 0; i<numbers.length; i++)
            if(numbers[i]>numbers[0])
                max=numbers[i];
        System.out.println("Minimum value : " +max);

    }


}
