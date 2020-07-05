package com.epam.rd.java.basic.practice1;

public class Part6 {
    public static void main(String[] args) {
        if (args.length != 1 ) return;
        Demo.print(getPrimeNumberAsString(args[0]));
    }

    public static String getPrimeNumberAsString(String amountOfNumbers){
        StringBuilder stringBuilder = new StringBuilder();
        int arrayLength = Integer.parseInt(amountOfNumbers);

        if (arrayLength < 1) return "";

        int[] primes = new int [arrayLength];
        int counter = 0;
        primes[counter++] = 2;

        for (int i = 3; counter < arrayLength; i+=2){
            if(isPrime(i)){
                primes[counter++] = i;
            }
        }

        for (int i : primes){
            stringBuilder.append(" ").append(i);
        }

        stringBuilder.deleteCharAt(0);
        return stringBuilder.toString();
    }

    private static boolean isPrime(int number){
        boolean check = true;

        for (int i = 2; i < number; i++){
            if(number % i == 0){
                check = false;
                break;
            }
        }
        return check;
    }

}
