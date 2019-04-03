package com.bridge.vehicle;

import com.bridge.engine.Engine;

public class SUV extends Vehicle{
    public SUV(Engine engine){
        this.weight = 5000;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("\nThe SUV is driving.");
        int horsepower = engine.run();
        reportSpeed(horsepower);
    }
}
