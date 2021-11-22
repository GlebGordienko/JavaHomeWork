package com.pb.gordienko.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth auth = new Auth();

        Scanner scan = new Scanner(System.in);
        String log;
        String pas;
        String sign;
        System.out.print("Ведите логин  ");
        log = scan.nextLine();
        System.out.print("Введите пароль ");
        pas = scan.nextLine();

        auth.signIn(log);
         //auth.signUp();


    }
}
