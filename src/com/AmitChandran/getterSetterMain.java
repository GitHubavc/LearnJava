package com.AmitChandran;

public class getterSetterMain {
    public static void main(String[] args) {

        getterSetterSub sub=new getterSetterSub();
        sub.setStudentMarks(122.3);
        sub.setStudentNo(23);
        sub.setStudentGrade('B');
        System.out.println("The new No is : "+sub.getStudentNo());
        System.out.println("The new Mark is : "+sub.getStudentMarks());
        System.out.println("The new Grade is : "+sub.getStudentGrade());
    }
}
