package com.epam.rd.java.basic.practice1;

public class Part3 {

    public static void main(String[] args) {
        try {
//            int number = Integer.parseInt(args[0]);
//            int number2 = Integer.parseInt(args[1]);
//            String word1 = String.valueOf(args[2]);
//            String word2 = String.valueOf(args[3]);

          String str = "";
            for (int i = 0; i < args.length; i++) {


                str = (" " + args[0] + " " + args[1] + " " + args[2] + " " + args[3]).trim();

               
            }
            System.out.print(str);
        }catch (IndexOutOfBoundsException e){
            System.out.print(e.getMessage());
        }
    }

}
