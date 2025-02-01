package com.AmitChandran;


import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String COMPANY_NAME ="TCS";
        int numInt = -123;
        double numDouble = 25.76;
        float numFloat = 2F;
        String myString = "Amit Chandra";
        char myChar = 'A';
        System.out.println("The numerical value is : " +Character.getNumericValue(myChar));
        long myLong = 5454654564547687656L;
        boolean myBoolean =true;
        byte myByte = -128;
        short myShort=  28832;
        int myInt2 = (int) 22.5;
        System.out.println(myInt2);
        System.out.println(Integer.MIN_VALUE);
        Scanner sc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Job Name : ");
        String myString1 = sc.nextLine();
        System.out.println("Enter your monthly salary in $ : ");
        float myInt = scn.nextFloat();
//        String myName= "Amit";
//        String myJob= "Engineer";
//        AnotherClass ac= new AnotherClass();
//        ac.getMyName();
//        System.out.println("Hello!!! from main class");
        System.out.println("I am " +myString + " by profession");
        System.out.println("I make around " +myInt+ "$ per month");




    }
}