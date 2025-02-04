package com.LamdaExpressions.Demo;

@FunctionalInterface
interface Cab{
   public String bookCab(String source ,String destination);
}

//lambda is always associated with functional interfaces
//One single abstract method is allowed in @functionalInterface


public class Test {
    public static void main(String[] args) {
        Cab cab=( source,  destination)-> {
            System.out.println("Ola cab is booked from "+source+ " To " +destination);
            return ("Price : 5000 Rs");
        };
        System.out.println(cab.bookCab("CLT","MAI"));
    }
}
