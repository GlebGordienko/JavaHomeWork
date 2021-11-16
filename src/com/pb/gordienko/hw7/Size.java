package com.pb.gordienko.hw7;

public enum Size {
    XXS("32", "Детский размер"),
    XS("34","Взрослый размер"),
    S("36","Взрослый размер"),
   M("38","Взрослый размер"),
   L("40","Взрослый размер");
    private String EuroSize;
    private String Description;
    Size(String EuroSize, String Description) {
      this.EuroSize = EuroSize;
        this.Description = Description;
    }
   public void getDescription0(Size size){
       System.out.println(Description);
    }

    public void getEuroSize(Size eursize){
        System.out.println(EuroSize);
    }


    }




