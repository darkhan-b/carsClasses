package com.company;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private String name;
    private List<Transport> transports = new ArrayList<>();
    public Train(String name) {
        this.name = name;
    }

    public int getTotalPassengersNum(){
        int s = 0;
        for (Transport ng : transports) {
            s+=ng.getPassengersNum();
        }
        return s;

    }
    public void addLoc(Transport transport) {
        transports.add(transport);
    }

    public void startWork() {
        transports.forEach(ng -> ng.work());
    }


}
