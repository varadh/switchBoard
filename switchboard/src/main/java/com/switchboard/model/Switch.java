package com.switchboard.model;

public class Switch extends ElectricalAppliance{

    public Switch(int applianceId, String model) {
        super(applianceId, model);
    }

    protected void turnOn() {
        System.out.println("Turning ON " +this.getModel());
        this.setState(true);
    }

    protected void turnOff(){
        System.out.println("Turning OFF " +this.getModel());
        this.setState(false);
    }
}
