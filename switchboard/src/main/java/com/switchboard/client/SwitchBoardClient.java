package com.switchboard.client;

import com.switchboard.model.*;


public class SwitchBoardClient {

    public static void main(String[] args) {
        iBoard switchBoard = new SwitchBoard(1);
        ElectricalAppliance bulb = new Bulb(1, "40W BULB");
        Switch bulbSwitch  = new Switch(1  , "40W BULB SWITCH");
        switchBoard.linkBulbToSwitch(bulbSwitch, bulb);

        ElectricalAppliance fan  = new Fan(1, "Ceiling Fan");
        Switch fanSwitch  = new Switch(1  , "Celing Fan SWITCH");
        switchBoard.linkBulbToSwitch(fanSwitch, fan);

        switchBoard.turnOn(fanSwitch);
        switchBoard.turnOn(bulbSwitch);

        String stateStr = fanSwitch.isState()? "ON": "OFF";
        System.out.println("Fan Switch is "+ stateStr);
        switchBoard.turnOff(fanSwitch);
        switchBoard.turnOff(bulbSwitch);

        stateStr = bulbSwitch.isState()? "ON": "OFF";
        System.out.println("BULB Switch is "+ stateStr);
        switchBoard.unLinkSwitchAndBulb(fanSwitch, fan);
        switchBoard.unLinkSwitchAndBulb(bulbSwitch, bulb);

    }

}
