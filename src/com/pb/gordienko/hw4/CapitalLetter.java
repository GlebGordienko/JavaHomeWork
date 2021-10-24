package com.pb.gordienko.hw4;

import java.util.Scanner;

public class CapitalLetter {
    static String[] Poslovam(String A){
        return A.split("\\s+");}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("введите строку");
        String stroka = scan.next();
        String[] massiv = Poslovam(stroka);

        StringBuilder stroka2 = new StringBuilder((Character.toUpperCase(massiv[0].charAt(0))) + massiv[0].substring(1));


        for (int i = 0; i < massiv.length; i++) {

            if (i != massiv.length - 1)
                stroka2.append(" ").append(Character.toUpperCase(massiv[i + 1].charAt(0))).append(massiv[i + 1].substring(1));
        }


        System.out.print(stroka2);


    }
}










