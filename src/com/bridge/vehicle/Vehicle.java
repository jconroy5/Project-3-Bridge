package com.bridge.vehicle;

import com.bridge.engine.Engine;

public abstract class Vehicle {

    //weight in U.S. pounds
    int weight;
    Engine engine;

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public abstract void drive();

    public void reportSpeed(int horsepower){
        int ratio = weight/horsepower;

        if (ratio < 6){
            System.out.println("The vehicle is going at ludicrous speed!");
        } else if (ratio < 10){
            System.out.println("The vehicle is going at fast speed.");
        } else if (ratio < 25){
            System.out.println("The vehicle is going at regular speed.");
        } else {
            System.out.println("The vehicle is going at slow speed.");
        }
    }
}
