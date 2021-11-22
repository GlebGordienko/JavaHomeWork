package com.pb.gordienko.hw8;



public class Auth {

   private String password;
   private String login ;

    public Auth() {

    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }
String regex = "da-zA-Zа-яёА-ЯЁ0-9";


    public void signUp (String sigup)throws WrongLoginException{
        if(sigup.matches("da-zA-Zа-яёА-ЯЁ0-9") ){
            setLogin(sigup);}
        else{
          String correctlog = "Введите корректный логин";
            throw new WrongLoginException(correctlog);
        }


    }



    }
    public void signIn (String sigin){



    }

}








