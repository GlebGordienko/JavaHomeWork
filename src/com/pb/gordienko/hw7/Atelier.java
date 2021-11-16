package com.pb.gordienko.hw7;


import com.pb.gordienko.hw6.Animal;

public class Atelier {
    static void dressMan(Clothes...clothes) {
       // for(int i = 0; i < clothes.length; i++){
       // if(clothes[i] instanceof Skirt ){
        for(Clothes count: clothes){
            // if(count instanceof Skirt){
            System.out.println(count.getColor());
        }}
       // else{System.out.println();}}}




    //static void dressWomen(Clothes[] clothes) {
    //}}



    public static void main(String[] args){
            Pants pants = new Pants(Size.XS, "black", 40);
        Pants skirt = new Pants(Size.L, "red", 32);
            Tie tie = new Tie(Size.M, "yellow", 10);
            Tshirt tshirt = new Tshirt(Size.S, "green", 15);
            Clothes[] cloth = new Clothes[]{pants, skirt, tie, tshirt};

            pants.dressMan();
            dressMan(cloth);

        }

}