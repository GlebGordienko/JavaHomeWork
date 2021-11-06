package com.pb.gordienko.hw6;

public class Veterinarian {
    public void treatAnimal(Animal... animals){
        for(Animal count: animals){
            System.out.println(count.getFood() + " , "+count.getLocation());
        }
    }
}
