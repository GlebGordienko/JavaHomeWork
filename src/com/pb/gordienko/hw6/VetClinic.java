package com.pb.gordienko.hw6;

public class VetClinic {
    public static void main(String[] args) throws Exception {
       Animal[] animals = new Animal[3];
       animals[0]= new Cat();
       animals[1] = new Dog();
       animals[2] = new Horse();
        Class wetClazz = Class.forName("com.pb.gordienko.hw6.Veterinarian");

        Object obj = wetClazz.newInstance();
        if (obj instanceof Veterinarian){((Veterinarian) obj).treatAnimal(animals);}

}}
