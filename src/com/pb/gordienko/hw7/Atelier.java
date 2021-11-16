package com.pb.gordienko.hw7;



public class Atelier {
    static void dressMan(Clothes[] clothes) {
    }

    static void dressWomen(Clothes[] clothes) {
    }
    public static void main(String[] args) {
        Pants pants = new Pants(Size.XS, "black", 40);
        Skirt skirt = new Skirt(Size.L, "red", 32);

        pants.dressMan();
    }


}

