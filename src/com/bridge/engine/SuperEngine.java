package com.bridge.engine;

public class SuperEngine implements Engine{
    int horsepower;

    public SuperEngine(){
        horsepower = 750;
    }

    @Override
    public int run() {
        System.out.println("The super engine is running.");
        return horsepower;
    }
}
