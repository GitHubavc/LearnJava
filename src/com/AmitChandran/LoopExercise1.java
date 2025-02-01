package com.AmitChandran;

import java.util.Scanner;

public class LoopExercise1 {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        while(sum<=100){
            System.out.print("Enter a number: ");
            sum += sc.nextInt();
        }
        System.out.println("Done: " +sum);
    }
}
