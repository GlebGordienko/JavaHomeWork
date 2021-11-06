package com.pb.gordienko.hw6;

public class Horse extends Animal{
    public Horse(){
        super("grass", "barn","I-go-go","");
    }
    @Override
    public void eat(){
        System.out.println(getAnimalType() + " ест " +getFood() + " покачивая гривой");
    }
    @Override
    public void sleep(){
        System.out.println(getAnimalType() + " спит, делая что-то лошадиное");
    }
}
