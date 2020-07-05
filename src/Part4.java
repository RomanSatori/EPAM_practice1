package com.epam.rd.java.basic.practice1;


public class Part4 {

    public static void main(String args[]) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        while (number1 != 0 && number2 != 0) {
            if (number1 > number2)
                number1 %= number2;
            else number2 %= number1;
        }
        System.out.print(number1 + number2);
    }


}
