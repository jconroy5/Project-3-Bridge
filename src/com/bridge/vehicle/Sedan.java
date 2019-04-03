package com.bridge.vehicle;

import com.bridge.engine.Engine;

public class Sedan extends Vehicle{
    public Sedan(Engine engine){
        this.weight = 3000;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("\nThe sedan is driving.");
        int horsepower = engine.run();
        reportSpeed(horsepower);
    }
}
