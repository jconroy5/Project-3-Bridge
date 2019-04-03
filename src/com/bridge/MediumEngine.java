package com.bridge;

public class MediumEngine implements Engine{
    int horsepower;

    public MediumEngine(){
        horsepower = 200;
    }

    @Override
    public int run() {
        System.out.println("The medium engine is running.");
        return horsepower;
    }
}
