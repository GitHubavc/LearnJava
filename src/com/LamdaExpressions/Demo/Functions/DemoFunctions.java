package com.LamdaExpressions.Demo.Functions;

import java.util.function.Function;

public class DemoFunctions {
    public static void main(String[] args) {
        Function<Integer,Integer> f=n->n*n;
        System.out.println(f.apply(5));
        System.out.println(f.apply(11));
        System.out.println(f.apply(14));
        System.out.println(f.apply(20));
        System.out.println(f.apply(155));

        //String length
        Function<String,Integer> fn = s->s.length();
        System.out.println(fn.apply("Welcome"));
        System.out.println(fn.apply("Java"));
        System.out.println(fn.apply("to"));

    }
}
