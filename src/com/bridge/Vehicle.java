package com.bridge;

public abstract class Vehicle {
    int weight;
    Engine engine;

    public void setEngine(Engine engine){
        this.engine = engine;
    }
}
