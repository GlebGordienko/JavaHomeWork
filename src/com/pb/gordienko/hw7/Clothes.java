package com.pb.gordienko.hw7;

public abstract class Clothes {
  private  Size size;
    private String color;
    private int price;
    public Size getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Clothes(Size size, String color, int price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }
}
