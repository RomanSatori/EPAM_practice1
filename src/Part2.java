package com.epam.rd.java.basic.practice1;

public class Part2 {
    public static void main(String[] args) {
        try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            int sum;
            sum = number1 + number2;
            System.out.print(sum);
        }catch(ArrayIndexOutOfBoundsException e){

        }
    }
}
