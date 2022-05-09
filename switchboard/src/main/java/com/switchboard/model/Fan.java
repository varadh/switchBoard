package com.switchboard.model;

public class Fan extends ElectricalAppliance {

    public Fan(int applianceId, String model) {
        super(applianceId, model);
    }

    protected void turnOn() {
        //code for turning on the FAN goes here
        this.setState(true);
        System.out.println(this.getModel() + " turned ON" );
    }

    protected void turnOff() {
        //code for turning off the FAN goes here
        this.setState(false);
        System.out.println(this.getModel() + " turned OFF" );
    }
}
