package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

//        obj.name = "temp";
        obj.setName("temp2");
        obj.getName();
    }
}