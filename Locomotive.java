package com.company;

public class Locomotive extends Transport {

    public Locomotive(String name, int passengersNum) {
        super(name, passengersNum);
    }

    @Override
    public int getPassengersNum() {
        return super.getPassengersNum();
    }

    @Override
    public void work() {
        System.out.println("Adding train");
    }
}
