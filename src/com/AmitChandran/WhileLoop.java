package com.AmitChandran;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.print("Enter a Num between 1 & 10 (e.g = 6) : ");
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        while (num<1 || num>10){
            System.out.print(num+ " is not between 1 and 10. Try again : ");
            num = sc.nextInt();

        }
        System.out.println(num+ " is between 1 and 10");

    }
}
