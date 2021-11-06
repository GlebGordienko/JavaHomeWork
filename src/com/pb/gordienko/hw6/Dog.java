package com.pb.gordienko.hw6;

public class Dog extends Animal{
    private String dataosomotra;
    public Dog(){

        super("meat", "doghouse","woof","");
    }
    @Override
    public void eat(){
        System.out.println(getAnimalType() + " ест " +getFood() + " виляя хвостом");
    }
    @Override
    public void sleep(){
        System.out.println(getAnimalType() + " спит, делая что-то собачье");
    }
}
