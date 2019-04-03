package com.bridge.engine;

/*
SmallEngine is an implementation of Engine.
Each Engine implementation has a set horsepower value and a run() function.
 */
public class SmallEngine implements Engine{
    int horsepower;

    public SmallEngine(){
        horsepower = 100;
    }

    @Override
    public int run() {
        System.out.println("The small engine is running.");
        return horsepower;
    }
}
