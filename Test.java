package com.company;

public class Test {
    final static void ThirdTask(){
        Transport f1 = new Cars("Toyota",4);
        System.out.println(f1.toString());
        Transport f2 = new Cars("KIA",7);
        System.out.println(f2.toString());
        Train tr = new Train("check train");
        tr.addLoc(new Locomotive("P01",150));
        tr.addLoc(new Locomotive("P02",120));
        tr.addLoc(new Locomotive("P03",135));
        tr.startWork();
        System.out.println("The total number of passengers "+tr.getTotalPassengersNum());
    }
}
