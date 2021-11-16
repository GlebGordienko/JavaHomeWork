package com.pb.gordienko.hw7;

public class Tie extends Clothes implements ManClothes {
    public Tie(Size size, String color, int price) {
        super(size, color, price);
    }
    @Override
    public void dressMan() {
        System.out.println(getClass().getSimpleName()+" "+getSize() +" "+ getColor() +" "+ getPrice() +" грн");

    }


}
