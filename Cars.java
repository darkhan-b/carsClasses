package com.company;

public class Cars extends Transport {

    public Cars(String name, int passengersNum) {
        super(name, passengersNum);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int getPassengersNum() {
        return super.getPassengersNum();
    }

    @Override
    public void work() {
        System.out.println("Adding car");
    }
}
