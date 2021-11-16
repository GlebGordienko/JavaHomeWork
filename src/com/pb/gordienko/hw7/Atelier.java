package com.pb.gordienko.hw7;



public class Atelier {
    static void dressWomen(Clothes[] clothes) {
        int i = 0;
        if(clothes[i] instanceof Skirt ){
            System.out.println(((Skirt) clothes[i]).dressWomen());i++;
    }

    //static void dressWomen(Clothes[] clothes) {
    //}}

    }

    public static void main(String[] args) {
        Pants pants = new Pants(Size.XS, "black", 40);
        Skirt skirt = new Skirt(Size.L, "red", 32);
        Tie tie = new Tie(Size.M, "yellow", 10);
        Tshirt tshirt = new Tshirt(Size.S, "green", 15);
        Clothes[] cloth = new Clothes[]{pants,skirt,tie,tshirt};

        pants.dressMan();
        dressWomen(cloth);

    }}

