package com.AmitChandran;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        int a,b,c,d;
        System.out.print("Enter a 4 digit number (e.g. 1234) : ");
        Scanner sc = new Scanner(System.in);
        String input =sc.nextLine();
        a=input.charAt(0);
        b= input.charAt(1);
        c=input.charAt(2);
        d=input.charAt(3);
        if((a+b)==(c+d)){
            System.out.println("The Number is a LUCKY Number!!");
        }else {
            System.out.println("The Number is NOT LUCKY Number!!");
        }
        sc.close();

    }
}
