package com.pb.gordienko.hw6;

import java.util.Objects;

public class Cat extends Animal{
   public Cat(){

        super("fish","home","meow","");
    }

    @Override
    public void eat(){
        System.out.println(getAnimalType() + " ест " +getFood() + " и мурчит");
    }
    @Override
    public void sleep(){
        System.out.println(getAnimalType() + " спит, делая что-то кошачье");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(getFood(), cat.getFood())&&Objects.equals(getLocation(),
                cat.getLocation())&&Objects.equals(getVoice(),
                cat.getVoice())&&Objects.equals(getAnimalType(), cat.getAnimalType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFood(),getLocation(),getVoice(),getAnimalType());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food=" + getFood() +
                ", location=" + getLocation() +
                ", voice=" + getVoice() +
                ", animalType=" + getAnimalType() +


                '}';
    }



    }


