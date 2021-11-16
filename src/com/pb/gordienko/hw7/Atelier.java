package com.pb.gordienko.hw7;

public class Atelier {
    static void dressMan(Clothes...clothes) {
        for(Clothes count: clothes){
             if(count instanceof Pants){
            System.out.println(count.getColor());
        }
        else if(count instanceof Tie)
             {
                 System.out.println(count.getColor());
             }
             else if(count instanceof Tshirt)
             {
                 System.out.println(count.getColor());
             }}}

    static void dressWomen(Clothes...clothes) {
        for(Clothes count: clothes){
            if(count instanceof Skirt){
            System.out.println(count.getColor());
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