package com.pb.gordienko.hw2;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.print("Введите первое целое число  ");
        operand1 = scan.nextInt();
        System.out.print("Введите второе целое число  ");
        operand2 = scan.nextInt();
        System.out.print("Введите знак арифметической операции  ");
        sign = scan.next();

        switch (sign) {
            case "*" :
                System.out.println(operand1 * operand2);
                break;
            case "+" :
                System.out.println(operand1 + operand2);
                break;
            case "-" :
                System.out.println(operand1 - operand2);
                break;
            case "/" :
                if (operand2 == 0){
                System.out.println("На ноль делить нельзя! В следующий раз попробуйте использовать другое значение для второго числа.");}
                else {System.out.println((double)operand1 / (double)operand2);}

                break;}

        }

}
