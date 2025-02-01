package com.AmitChandran;

import java.util.Scanner;

public class LoopExercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum =1;
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                sum+=i;

        System.out.println(sum==1 ? "prime" : "not prime");
    }
}
