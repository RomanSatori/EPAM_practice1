package com.epam.rd.java.basic.practice1;

public class Part7 {

    public static void main(String[] args) {
        String arrow = " ==> ";
        System.out.println("A"+arrow+str2int("A")+arrow+int2str(1));
        System.out.println("B"+arrow+str2int("B")+arrow+int2str(2));
        System.out.println("Z"+arrow+str2int("Z")+arrow+int2str(26));
        System.out.println("AA"+arrow+str2int("AA")+arrow+int2str(27));
        System.out.println("AZ"+arrow+str2int("AZ")+arrow+int2str(52));
        System.out.println("BA"+arrow+str2int("BA")+arrow+int2str(53));
        System.out.println("ZZ"+arrow+str2int("ZZ")+arrow+int2str(702));
        System.out.println("AAA"+arrow+str2int("AAA")+arrow+int2str(703));


    }

    public static int str2int(String number) {
        String s = number.replaceAll("\\s", "");
        int result = 0;
        for (char c : s.toCharArray()) {
            result = result * 26 + (c - 'A') + 1;
        }
        return result;
    }

    public static String int2str(int number) {

        StringBuilder stringBuilder = new StringBuilder();
        while (number > 0) {
            number--;
            char ch = (char) (number % 26 + 'A');
            number /= 26;
            stringBuilder.append(ch);
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static String rightColumn(String number) {
        return int2str(str2int(number) + 1);
    }
}
