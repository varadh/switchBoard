package com.switchboard.model;

public abstract class ElectricalAppliance {
    private int applianceId;
    private boolean state = false;
    private String model;

    public ElectricalAppliance(int applianceId, String model){
        this.applianceId = applianceId;
        this.model = model;
    }

    public int getBulbId() {
        return applianceId;
    }

    public boolean isState() {
        return state;
    }

    public String getModel() {
        return model;
    }

    protected abstract void turnOn();

    protected abstract void turnOff();

    protected void setState(boolean state){
        this.state = state;
    }

    /*
     TODO - need to provide default hashcode and equals logic
     */
}
