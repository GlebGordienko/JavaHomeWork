package com.pb.gordienko.hw5;



public class Book1 {

    private   String author;
    private   String title;
    private  int year;
String bookInfo(){return title + " ( "+author +" "+year+" )" ;};

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor(){
        return author;}
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;}

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear(){
        return year;}

    public Book1(String author,String title, int year){
        this.author =author;
        this.title = title;
        this.year =year;}

}
