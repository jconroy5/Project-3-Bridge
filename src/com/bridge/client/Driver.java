package com.bridge.client;

import com.bridge.engine.*;
import com.bridge.vehicle.*;

/*
Driver is the client. Run it to execute the main method.
Three example vehicles are created and their engines are swapped to achieve different speed levels.
 */
public class Driver {

    public static void main(String[] args) {

        //creating hondaCivic as an example Sedan
        Vehicle hondaCivic = new Sedan(new MediumEngine());
        hondaCivic.drive();

        //changing hondaCivic's engine to SuperEngine
        hondaCivic.setEngine(new SuperEngine());
        hondaCivic.drive();

        //creating fordEscape as an example Sedan
        Vehicle fordEscape = new SUV(new LargeEngine());
        fordEscape.drive();

        //changing fordEscape's engine to SuperEngine
        fordEscape.setEngine(new MediumEngine());
        fordEscape.drive();

        //creating hondaCivic as an example Sedan
        Vehicle ctaBus = new Bus(new LargeEngine());
        ctaBus.drive();
    }
}
