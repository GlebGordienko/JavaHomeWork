package com.pb.gordienko.hw5;




public class Library1 {
    public static void main(String[] args) {
        Reader1[] readerArray = new Reader1[3];
        readerArray[0]= new Reader1("Иван","1","эконом","01011991","0666666666");
        readerArray[1]= new Reader1("Федор","2","мат","02021992","0777777777");
        readerArray[2]= new Reader1("Петр","3","физ","03031993","0888888888");

        Book1[] bookArray = new Book1[3];

        bookArray[0] = new Book1("Иванов И. И.","Приключения",2000 );
        bookArray[1] = new Book1("Сидоров А.В.","Словарь",1980);
        bookArray[2] = new Book1("Гусев К. В","Энциклопедия",2010);

        System.out.println(bookArray[0].bookInfo());
        System.out.println(bookArray[1].bookInfo());
        System.out.println(bookArray[2].bookInfo());

        System.out.println(readerArray[0].readerInfo());
        System.out.println(readerArray[1].readerInfo());
        System.out.println(readerArray[2].readerInfo());

        readerArray[1].takeBook(bookArray[2].getTitle(),bookArray[1].getTitle(),bookArray[0].getTitle());
        readerArray[2].takeBook(bookArray[2].getYear(),bookArray[1].getYear(),bookArray[0].getYear());
        readerArray[0].takeBook((bookArray));
        readerArray[1].returnBook(bookArray[2].getTitle(),bookArray[1].getTitle(),bookArray[0].getTitle());
        readerArray[2].returnBook(bookArray[2].getYear(),bookArray[1].getYear(),bookArray[0].getYear());
        readerArray[0].returnBook((bookArray));




    }
}
