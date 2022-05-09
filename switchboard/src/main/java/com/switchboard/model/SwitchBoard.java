package com.switchboard.model;

import java.util.HashMap;
import java.util.Map;

public class SwitchBoard implements iBoard {

    private int boardId;
    private Map<Switch, ElectricalAppliance> switchToBulbMap;

    public SwitchBoard(int boardId){
        this.boardId = boardId;
        this.switchToBulbMap = new HashMap<Switch, ElectricalAppliance>();
    }

    public int getBoardId() {
        return boardId;
    }

    public void resetAllSwitches(Map<Switch, ElectricalAppliance> switchToBulbMap) {
        this.switchToBulbMap = switchToBulbMap;
    }

    public void linkBulbToSwitch(Switch s, ElectricalAppliance e){
        switchToBulbMap.put(s, e);
    }

    public void unLinkSwitchAndBulb(Switch s, ElectricalAppliance e){
        switchToBulbMap.remove(s);
    }

    public void turnOn(Switch s){
        ElectricalAppliance e = switchToBulbMap.get(s);
        if(e == null){
            throw new RuntimeException("Invalid Switch");
        }else{
            System.out.println("**************");
            s.turnOn();
            e.turnOn();
            System.out.println("**************");
        }
    }

    public void turnOff(Switch s){
        ElectricalAppliance e = switchToBulbMap.get(s);
        if(e == null){
            throw new RuntimeException("Invalid Switch");
        }else{
            System.out.println("**************");
            s.turnOff();
            e.turnOff();
            System.out.println("**************");
        }
    }
}
