package com.pb.gordienko.hw10;

public class NumBox <T extends Number>{


    private T[] numbers;
    public NumBox(int size) {
        numbers = (T[]) new Number[size];


    }
    public T get(int index) {
        return numbers[index];
    }

    public void set(int index, T number) {
        this.numbers[index] = number;
    }
    public void add(int index, T num) throws ArrayIndexOutOfBoundsException {
        if (index > numbers.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else numbers[index] = num;}


}
