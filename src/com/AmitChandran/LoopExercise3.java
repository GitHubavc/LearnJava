package com.AmitChandran;

import java.util.Scanner;

public class LoopExercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int max=num;
        int min= num;

        if(num>=0){
            while(true) {
                num = sc.nextInt();
                if (num < 0)
                    break;
                if (num > max)
                    max = num;
                if (num < min)
                    min = num;
            }
            System.out.println("min= "+min+ " max= " +max);

        }else{
            System.out.println(num+ " number is invalid");
        }

    }


}
