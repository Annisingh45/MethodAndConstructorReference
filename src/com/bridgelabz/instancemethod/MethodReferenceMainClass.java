package com.bridgelabz.instancemethod;

public class DemoMain {
    public static void main(String[] args) {
       NumberPrinter example=new NumberPrinter();
       Displayable demo=example::print;
       demo.display();
    }
}
