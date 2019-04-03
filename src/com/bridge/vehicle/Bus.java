package com.bridge.vehicle;

import com.bridge.engine.Engine;

public class Bus extends Vehicle{
    public Bus(Engine engine){
        this.weight = 25000;
        this.engine = engine;
    }
}
