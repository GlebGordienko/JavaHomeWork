package com.pb.gordienko.hw2;

import java.util.Scanner;

public class Interval {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int Peremennaya;
    System.out.print("Введите целое число  ");
    Peremennaya = scan.nextInt();
  if (Peremennaya >= 0 && Peremennaya <= 14){
      System.out.println("[o -14]");}
  else if(Peremennaya >= 15 && Peremennaya <= 35){
      System.out.println("[15 -35]");}
  else if(Peremennaya >= 36 && Peremennaya <= 50){
      System.out.println("[36 -50]");}
  else if(Peremennaya >= 51 && Peremennaya <= 100){
      System.out.println("[51 -100]");}
  else {
      System.out.println("Введенное число не попадает ни в один из имеющихся промежутков");}


}}
