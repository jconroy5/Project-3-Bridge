package com.bridge.vehicle;

import com.bridge.engine.Engine;

/*
Bus is a subclass of Vehicle.
Each Vehicle subclass has a set weight (in pounds) and a drive() function.
 */
public class Bus extends Vehicle{
    public Bus(Engine engine){
        this.weight = 25000;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("\nThe bus is driving.");
        int horsepower = engine.run();
        reportSpeed(horsepower);
    }
}
