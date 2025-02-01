package com.AmitChandran;

import java.util.Scanner;

/***
 * find the nth fibinocci number
 */
public class LoopExercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer number: ");
        int num = sc.nextInt();
        int result=0;
        int v1=1;
        int v2=1;
        for(int i=1;i<=num-2;i++){
            result=v1+v2;
            v1=v2;
            v2=result;
        }
        System.out.println("Result = " +(result==0 ? 1:result));
    }
}
