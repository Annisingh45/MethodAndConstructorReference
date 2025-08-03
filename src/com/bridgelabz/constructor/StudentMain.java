package com.bridgelabz.constructor;

import java.util.function.Supplier;

public class StudentMain {
    public static void main(String[] args) {
        //Using lembda expression
        Supplier<Student> supplier=()->new Student();
        System.out.println(supplier.get());

        //Using constructor reference
        Supplier supplier1=Student ::new;
        System.out.println(supplier1.get());
    }
}
