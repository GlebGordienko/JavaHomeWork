package com.pb.gordienko.hw7;

public class Atelier {
    static void dressMan(Clothes...clothes) {
        for(Clothes count: clothes){
             if(count instanceof Pants){
                 ((Pants) count).dressMan();
        }
        else if(count instanceof Tie)
             {
                 ((Tie) count).dressMan();
             }
             else if(count instanceof Tshirt)
             {
                 ((Tshirt) count).dressMan();
             }}}

    static void dressWomen(Clothes...clothes) {
        for(Clothes count: clothes){
            if(count instanceof WomenClothes){
            //((Skirt) count).dressWomen();
                WomenClothes wc = (WomenClothes) count;
                wc.dressWomen();
        }}}

    public static void main(String[] args){
            Pants pants = new Pants(Size.XS, "black", 40);
        Skirt skirt = new Skirt(Size.L, "red", 32);
            Tie tie = new Tie(Size.M, "yellow", 10);
            Tshirt tshirt = new Tshirt(Size.S, "green", 15);
            Clothes[] cloth = new Clothes[]{pants, skirt, tie, tshirt};


            dressWomen(cloth);
            dressMan(cloth);

        }

}