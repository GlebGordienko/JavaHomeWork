package com.pb.gordienko.hw7;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size size, String color, int price) {
        super(size, color, price);
    }


    @Override
    public void dressWomen() {
        System.out.println(getClass().getSimpleName()+" "+getSize() +" "+ getColor() +" "+ getPrice() +" гривен");
}}
