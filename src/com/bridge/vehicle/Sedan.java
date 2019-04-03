package com.bridge.vehicle;

import com.bridge.engine.Engine;

public class Sedan extends Vehicle{
    public Sedan(Engine engine){
        this.weight = 3000;
        this.engine = engine;
    }
}
