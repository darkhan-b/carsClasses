package com.company;

abstract public class Transport {

    private String name;
    private int passengersNum;

    public Transport(String name, int passengersNum) {
        this.name = name;
        this.passengersNum = passengersNum;
    }

    public int getPassengersNum() {
        return passengersNum;
    }

    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", passengersNum=" + passengersNum +
                '}';
    }

    abstract public void work();
}
