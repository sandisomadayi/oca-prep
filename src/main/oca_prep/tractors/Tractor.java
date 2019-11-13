package oca_prep.tractors;

import oca_prep.Vehicle;

public class Tractor extends Vehicle {
    public void move() {
        System.out.println("moving tractor");
    }

    public void trailer() {
        System.out.println("tractor trailer");
    }
    public void fuelType() {
        System.out.println("diesel-tractor");
    }
}
