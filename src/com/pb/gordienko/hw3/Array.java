package com.pb.gordienko.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int a = 0; a < array.length; a++) {
            System.out.println( "Введите целое число для "+ (a+1) +" элемента массива:");
            array[a] = scan.nextInt();}

        System.out.print("Массив:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);}


            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum = sum + array[j];
            }
            System.out.println("Сумма всех элементов массива: " + sum);

        int count = 0;
        for(int h = 0; h<array.length; h++)
        {
            if(array[h] > 0)
                count += 1;
        }
        System.out.println("Кол-во положительных элементов: "+ count);

        int sort = 1;
        int sort2;
        while(sort !=0) {
            sort = 0;
            for (int k = 0; k < array.length-1; k++) {
                if(array[k] > array[k+1]){
                    sort = 1;

                    sort2 = array[k];
                    array[k] = array[k+1];
                    array[k+1] = sort2;
                }
            }
        }
        System.out.println("Отсортированный по возрастанию массив: ");
        for (int l = 0; l < array.length; l++) {
            System.out.println(array[l]);}









    }}
