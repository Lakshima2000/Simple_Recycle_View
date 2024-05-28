package com.example.myapplication;

public class model {
    String name,number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public model(String name, String number) {
        this.name = name;
        this.number = number;
    }
}
