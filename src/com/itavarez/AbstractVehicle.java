package com.itavarez;

//fields
//methods
//"abstract" methods

public abstract class AbstractVehicle {
    protected int fuel;

    //Methods overloading by using multiple constructor with different property
    //constructor
    public AbstractVehicle(int fuel) {
        this.fuel = fuel;
    }

    public  AbstractVehicle() {
        fuel = 1;
    }

    //Abstract methods, the child needs to implement
    public abstract String getPath();
    public abstract String getName();

    public void move() {
        fuel--;
    }

    public int getFuel() {
        return fuel;
    }

    public void addFuel(int i) {
        fuel = fuel + i;
    }
}
