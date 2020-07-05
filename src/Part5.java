package com.epam.rd.java.basic.practice1;

public class Part5 {
    static int getSum(int n)
    {
        int sum = 0;

        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }

        return sum;
    }
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        System.out.println(getSum(number));
    }
}
