package com.pb.gordienko.hw9;

import java.io.FileWriter;
import java.io.Writer;


public class FileNumbers {
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

    }

}
