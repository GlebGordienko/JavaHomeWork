package com.pb.gordienko.hw9;

import java.io.*;
import java.util.Scanner;


public class FileNumbers {
    public static void createOddNumbersFile() throws IOException {
        try (Scanner in = new Scanner(new File("C://Java/numbers.txt"))) {
            PrintWriter pw = new PrintWriter(new File("C://Java/odd-numbers.txt"));
            while (in.hasNextLine()) {
                Scanner line = new Scanner(in.nextLine());
                while (line.hasNextInt()) {
                    int a = line.nextInt();
                    if (a % 2 == 0) {
                        pw.print(0 + " ");

                    } else
                    pw.print(a + " ");
                }
                line.close();
                pw.println();
            }

            pw.close();
        } catch (IOException ioException) {
            System.out.println("Ошибка" + ioException);
        }
    }

    public static void createNumbersFile() throws Exception {
        try (Writer writer = new FileWriter("C://Java/numbers.txt")) {
            int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++,System.out.println()) {

                for (int j = 0; j < array.length; j++) {

                    array[i][j] = ((int) (Math.random() * 99 + 1));
                    writer.write(" ");
                    writer.write(Integer.toString(array[i][j]));

                }
                writer.write("\n");
            }
        } catch (Exception e) {
            System.out.println("ошибка" + e);
        }
    }
    public static void main(String[] args) throws Exception {
        createNumbersFile();
        createOddNumbersFile();
    }

}
