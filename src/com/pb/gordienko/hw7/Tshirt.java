package com.pb.gordienko.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{
    public Tshirt(Size size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWomen() {

    }


}
