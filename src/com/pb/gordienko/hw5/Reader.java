package com.pb.gordienko.hw5;


public class Reader {
    private String Name;
    private String Number;
    private String Fak;
    private String Birth;
    private String Phone;

    String readerInfo() {
        return "имя: " + Name + ", " + "номер читательского билета: " + Number +
                ", " + "факультет: " + Fak + ", " + "дата рождения: " + Birth + ", " + "номер телефона: " + Phone;
    }

    public Reader(String Name, String Number, String Fak, String Birth, String Phone) {
        this.Name = Name;
        this.Number = Number;
        this.Fak = Fak;
        this.Birth = Birth;
        this.Phone = Phone;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public void setFak(String Fak) {
        this.Fak = Fak;
    }

    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getName() {
        return Name;
    }

    public String getNumber() {
        return Number;
    }

    public String getFak() {
        return Fak;
    }

    public String getBirth() {
        return Birth;
    }

    public String getPhone() {
        return Phone;
    }

    public void takeBook(String... nameBooks) {

        StringBuilder vivod = new StringBuilder();
        for (String nameBook : nameBooks) {
            vivod.append(nameBook).append(", ");
        }
        System.out.println(Name + " взял книги:" + vivod);
    }


    public void takeBook(Book... book) {
        StringBuilder vivod2 = new StringBuilder();

        for (Book number : book) {
            vivod2.append(number.getTitle() + " (" + number.getAuthor() + " " + number.getYear() + " ), ");

        }
        System.out.println(Name + " взял книги: " + vivod2);
    }


    public void takeBook(int... years) {
        int i = 0;
        for (int yearBook : years) {
            i++;
        }
        System.out.println("" + Name + " взял " + i + " книги");

    }

    public void returnBook(String... nameBooks2) {

        StringBuilder vivod3 = new StringBuilder();
        for (String nameBook2 : nameBooks2) {
            vivod3.append(nameBook2).append(", ");
        }
        System.out.println(Name + " вернул книги:" + vivod3);
    }


    public void returnBook(Book... book12) {
        StringBuilder vivod4 = new StringBuilder();

        for (Book number : book12) {
            vivod4.append(number.getTitle() + " (" + number.getAuthor() + " " + number.getYear() + " ), ");

        }
        System.out.println(Name + " вернул книги: " + vivod4);
    }


    public void returnBook(int... years2) {
        int i = 0;
        for (int yearBook : years2) {
            i++;
        }
        System.out.println("" + Name + " вернул " + i + " книги");

    }
}
