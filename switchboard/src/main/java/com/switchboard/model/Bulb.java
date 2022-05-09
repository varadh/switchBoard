package com.switchboard.model;

public class Bulb extends ElectricalAppliance {

    public Bulb(int applianceId, String model) {
        super(applianceId, model);
    }

    protected void turnOn() {
        //code for turning on the bulb goes here
        this.setState(true);
        System.out.println(this.getModel() + " turn ON" );
    }

    protected void turnOff() {
        //code for turning off the bulb goes here
        this.setState(false);
        System.out.println(this.getModel() + " turn OFF" );
    }
}
