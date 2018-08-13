package com.example.javajokes;

public class MyClass {
    public String getJoke() {
        String number = String.valueOf(250 + Math.random()*350);
        number = number.substring(0,6);
        return "Lots of money to a juggler: $" + number;
    }
}
