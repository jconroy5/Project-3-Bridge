package com.bridge.vehicle;

import com.bridge.engine.Engine;

/*
Abstract vehicle class. Extended by vehicle types (Sedan, SUV, Bus).
Vehicle speed is calculated by weight proportional to engine horsepower.
 */
public abstract class Vehicle {

    //weight in U.S. pounds
    int weight;
    Engine engine;

    //changes the engine type of a vehicle
    public void setEngine(Engine engine){
        this.engine = engine;
        System.out.println("\nThe vehicle now has a " + engine + " engine.");
    }

    //abstract method which tells a vehicle's engine to run
    public abstract void drive();

    //reports speed of a vehicle to the console by weight divided by horsepower
    public void reportSpeed(int horsepower){
        int ratio = weight/horsepower;

        if (ratio < 6){
            System.out.println("The vehicle is going at LUDICROUS SPEED!");
        } else if (ratio < 10){
            System.out.println("The vehicle is going at fast speed.");
        } else if (ratio < 25){
            System.out.println("The vehicle is going at regular speed.");
        } else {
            System.out.println("The vehicle is going at slow speed.");
        }
    }
}
