package com.epam.rd.java.basic.practice1;


public class Demo {

    public static void main(String[] args) {
        System.out.println("\nPart 5");
        Part7.main(new String[] {"836" , "AFD", "BE"});
        System.out.println("\nPart 6");
        Part6.main(new String[] {"10"});
    }

    public static void print(String string) {
        if ("".equals(string)){
            return;
        }
        System.out.print(string);
    }
}
