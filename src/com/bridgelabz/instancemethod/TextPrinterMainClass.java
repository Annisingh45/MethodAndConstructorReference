package com.bridgelabz.instancemethod;

public class TextPrinterMainClass {
    public static void main(String[] args) {
        //Using lambda expression
        TextPrinter demo=(string -> System.out.println(string));
        demo.display("Anni singh");

        //Using method reference
        TextPrinter demo1=System.out::println;
        demo1.display("Khushi Singh");
    }
}
