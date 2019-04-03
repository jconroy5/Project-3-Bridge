package com.bridge.vehicle;

import com.bridge.engine.Engine;

public abstract class Vehicle {

    //weight in U.S. pounds
    int weight;
    Engine engine;

    public void setEngine(Engine engine){
        this.engine = engine;
    }
}
