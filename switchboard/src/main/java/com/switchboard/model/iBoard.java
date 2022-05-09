package com.switchboard.model;

import java.util.Map;

public interface iBoard {
    public void resetAllSwitches(Map<Switch, ElectricalAppliance> switchToBulbMap);

    public void linkBulbToSwitch(Switch s, ElectricalAppliance e);

    public void unLinkSwitchAndBulb(Switch s, ElectricalAppliance e);

    public void turnOn(Switch s);

    public void turnOff(Switch s);

}
