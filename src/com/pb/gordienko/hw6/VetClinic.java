package com.pb.gordienko.hw6;


public class VetClinic {
    public static void main(String[] args) {

       Animal[] animals = new Animal[3];
       animals[0]= new Cat();
       animals[1] = new Dog();
       animals[2] = new Horse();
       Veterinarian vet = new Veterinarian();





        for(Animal count: animals){count.eat();}
        vet.treatAnimal(animals);

        System.out.println(animals[0].toString());
        System.out.println(animals[0].hashCode());


    }
}
