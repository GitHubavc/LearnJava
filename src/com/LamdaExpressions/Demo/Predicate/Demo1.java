package com.LamdaExpressions.Demo.Predicate;

import java.util.function.Predicate;

//Predicate is used if you have conditional checks in program

public class Demo1 {
    public static void main(String[] args) {
       // example#1
        Predicate<Integer> p=i->(i>10);
        System.out.println(p.test(20));

        Predicate<String> pr=s -> (s.length()>4);
        System.out.println(pr.test("welcome"));

        //example #2 (print whose size >4)
        String[] names= {"david","anu","aarav","amit","argot"};

        for(String name:names){
            if(pr.test(name)){
                System.out.println(name);
            }
        }


    }
}
