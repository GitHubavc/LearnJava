package com.AmitChandran;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter an First input value : ");
        double intValue=input.nextDouble();
        System.out.println(" Enter an Second input value : ");
        double intValue2=input.nextDouble();
        if(!(intValue2==0)) {
            double addValue = intValue + intValue2;
            double subValue = intValue - intValue2;
            double mulValue = intValue * intValue2;
            double divValue = intValue / intValue2;

            System.out.println("Added value is : " + addValue);
            System.out.println("Subtracted value is : " + subValue);
            System.out.println("Multiplied value is : " + mulValue);
            System.out.println("Divided value is : " + divValue);
        } else {
            System.out.println("The second value cannot be 0");
        }
       input.close();
    }
}
