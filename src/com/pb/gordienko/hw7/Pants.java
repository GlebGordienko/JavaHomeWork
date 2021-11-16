package com.pb.gordienko.hw7;

public class Pants extends Clothes implements ManClothes,WomenClothes {
    public Pants(Size size, String color, int price) {
        super(size, color, price);
    }




    @Override
    public boolean dressWomen() {
        System.out.println(getClass().getSimpleName()+" "+getSize() +" "+ getColor() +" "+ getPrice() +" гривен");

        return false;
    }

    @Override
    public void dressMan() {
        System.out.println(getClass().getSimpleName()+" "+getSize() +" "+ getColor() +" "+ getPrice() +" гривен");

    }
}