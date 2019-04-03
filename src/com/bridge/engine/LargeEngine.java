package com.bridge.engine;

/*
LargeEngine is an implementation of Engine.
Each Engine implementation has a set horsepower value and a run() function.
 */
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
