package com.AmitChandran;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(true){
            displayMenu();
            int choice = input.nextInt();
            if(choice==1){
                System.out.print("Enter an Integer: ");
                integers.add(input.nextInt());
                System.out.println("Element Added!!");
            }
            else if (choice==2) {
                System.out.print("Enter the number to Remove: ");
                int elementToRemove = input.nextInt();
                if(integers.contains(elementToRemove)){
                    integers.remove(Integer.valueOf(elementToRemove));
                    System.out.println("Element Removed!!");
                }else
                    System.out.println("Element not found !!!");

            }
            else if (choice==3) {
                System.out.println("Your List: "+integers);
            }
            else if (choice==4) {
                System.out.println("Good Bye!!");
                break;

            }

        }
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("1. ADD");
        System.out.println("2. REMOVE");
        System.out.println("3. DISPLAY");
        System.out.println("4. EXIT");
        System.out.println();
        System.out.print("Your Choice: ");
    }
}
