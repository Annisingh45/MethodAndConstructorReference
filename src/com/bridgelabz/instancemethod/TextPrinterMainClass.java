package com.bridgelabz.instancemethod;

public class DemoMain {
    public static void main(String[] args) {
        //Using lambda expression
        Demo demo=(string -> System.out.println(string));
        demo.display("Anni singh");

        //Using method reference
        Demo demo1=System.out::println;
        demo1.display("Khushi Singh");
    }
}
