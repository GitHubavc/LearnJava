package com.LamdaExpressions.Demo.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String name;
    int salary;
    int experiance;

    public Employee(String name, int salary, int experiance) {
        this.name = name;
        this.salary = salary;
        this.experiance = experiance;
    }
}

public class Demo2 {
    public static void main(String[] args) {

        //emp obj--> return name sal>3k and exp>2
        Employee emp =new Employee("John",5000,3);
        Predicate<Employee> pr= e->(e.salary>20000 && e.experiance>3);
      //  System.out.println(pr.test(emp));

        //Ex2
        ArrayList<Employee> al= new ArrayList<>();
        al.add(new Employee("Annie",50000,5));
        al.add(new Employee("John",30000,3));
        al.add(new Employee("Peter",25000,2));
        al.add(new Employee("Anna",15000,6));
        al.add(new Employee("Peter",45000,6));

        for(Employee e:al){
            if(pr.test(e)){

                System.out.println(e.name+" "+e.salary+" "+e.experiance);

            }
        }




    }


}
