package com.bridge.client;

import com.bridge.engine.*;
import com.bridge.vehicle.*;

public class Driver {

    public static void main(String[] args) {

        Vehicle hondaCivic = new Sedan(new MediumEngine());
        hondaCivic.drive();

        hondaCivic.setEngine(new SuperEngine());
        hondaCivic.drive();

        Vehicle fordEscape = new SUV(new LargeEngine());
        fordEscape.drive();

        fordEscape.setEngine(new MediumEngine());
        fordEscape.drive();

        Vehicle ctaBus = new Bus(new LargeEngine());
        ctaBus.drive();
    }
}
