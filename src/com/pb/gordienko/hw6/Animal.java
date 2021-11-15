package com.pb.gordienko.hw6;

public class Animal {
    private String food;
    private String location;
    private String voice;
    private String animalType ;

    public Animal(String food, String location, String voice, String animalType){
        this.food = food;
        this.location = location;
        this.voice = voice;
        this.animalType = this.getClass().getSimpleName();

    }




    public String getAnimalType() {
        return animalType;
    }





    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }



    public void makeNoise(){
        System.out.println(animalType+ " делает "+ voice);
    }
    public void sleep(){
        System.out.println(animalType+" спит");
    }
    public void eat(){
        System.out.println(animalType+" ест " +"food");
    }


}
