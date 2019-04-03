package com.bridge.engine;

/*
MediumEngine is an implementation of Engine.
Each Engine implementation has a set horsepower value and a run() function.
 */
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
