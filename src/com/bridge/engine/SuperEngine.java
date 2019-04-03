package com.bridge.engine;

/*
SuperEngine is an implementation of Engine.
Each Engine implementation has a set horsepower value and a run() function.
 */
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
