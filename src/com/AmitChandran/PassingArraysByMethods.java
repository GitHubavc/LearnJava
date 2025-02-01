package com.AmitChandran;

public class PassingArraysByMethods {
    public static void main(String[] args) {
        int[] numbers = {0,1};
        change(numbers);
        printArray(numbers);
    }

    public static void change(int[] numbers){
        numbers[0]=3;
        numbers[1]=4;
    }

    public static void printArray(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]+ " ");
        }
    }

}
