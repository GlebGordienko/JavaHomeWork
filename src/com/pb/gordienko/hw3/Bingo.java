package com.pb.gordienko.hw3;


import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random rand  = new Random();
        Scanner scan = new Scanner(System.in);
        int i;
        String x = "0" ;
        i = rand.nextInt(101);
        System.out.println("Попробуйте угадать целое число от 0 до 100. Если захотите выйти, введите exit");

        int attempt = 0;
        try {

            while (Integer.parseInt(x) != i) {
                attempt++;
                System.out.println("Введите целое число:");
                x = scan.next();

                if (x.equals("exit")) {
                    break;
                }

                if (Integer.parseInt(x) > i) {
                    System.out.println("Ваше число больше загаданного");
                    continue;
                }

                if (Integer.parseInt(x) < i) {
                    System.out.println("Ваше число меньше загаданного");
                    continue;
                }

                System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
                break;


            }


            System.out.println("Конец игры!");
        }


         catch(NumberFormatException numberFormatException){
            System.out.println("Неверное значение, попробуйте заново");
        } }






    }

