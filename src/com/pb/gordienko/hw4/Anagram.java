package com.pb.gordienko.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static String meth1(String A) {
        return A.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ0-9]", "");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("введите строку");
        String input = scan.next();
        System.out.println("введите анаграмму");
        String input2 = scan.next();

        String inputchr = meth1(input.toLowerCase());
        char[] charArray = inputchr.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);


        String inputchr2 = meth1(input2.toLowerCase());
        char[] charArray2 = inputchr2.toCharArray();
        Arrays.sort(charArray2);
        String sortedString2 = new String(charArray2);


        boolean result;
        result = sortedString.equals(sortedString2);


        if (result) {
            System.out.println("Это анаграмма");
        } else {
            System.out.println("Это не анаграмма");
        }


    }
}
