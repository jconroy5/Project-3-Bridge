package com.bridge.engine;

public class LargeEngine implements Engine{
    int horsepower;

    public LargeEngine(){
        horsepower = 350;
    }

    @Override
    public int run() {
        System.out.println("The large engine is running.");
        return horsepower;
    }
}
