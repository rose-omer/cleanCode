package com.tutorial.clean.code.chapter03Metodlar.c16;

public class Mechanic {

    public void serviceBus() {
        System.out.println("Servicing bus now");
        washVehicle();
    }
    public void serviceCar() {
        System.out.println("Servicing car now");
        washVehicle();
    }
    public void washVehicle() {
        //Process washing
    }

}
