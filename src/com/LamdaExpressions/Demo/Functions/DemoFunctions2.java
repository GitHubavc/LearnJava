package com.LamdaExpressions.Demo.Functions;

import java.util.ArrayList;
import java.util.function.Function;

class Employee{
    String ename;
    int salary;

    public Employee(String ename, int salary) {
        this.ename = ename;
        this.salary = salary;
    }
}

public class DemoFunctions2 {
    public static void main(String[] args) {
        ArrayList<Employee> emplist = new ArrayList<Employee>();
        emplist.add(new Employee("David",50000));
        emplist.add(new Employee("Anu",20000));
        emplist.add(new Employee("Tom",24000));
        emplist.add(new Employee("Rex",75000));

        Function<Employee,Integer> fn = e->{
            int sal = e.salary;
            if(sal>=10000 &&  sal<20000)
                return(sal * 10/100);
            else if(sal>20000 && sal<25000)
                return (sal *20/100);
            else if(sal>25000 && sal<50000)
                return (sal *30/100);
            else
                return (sal *40/100);
        };

        for(Employee emp:emplist){
            int bonus =fn.apply(emp);
            System.out.println(emp.ename+" "+emp.salary);
            System.out.println("Bonus is " +bonus);
        }

    }
}
