package com.bridgelabz.staticmethod;

public class CalculatorImpl {
    public static void main(String[] args) {

        Calculator calculator=Adder::add;
        int result=calculator.add(10,20);
        System.out.println("Sum :"+result);
    }
}
