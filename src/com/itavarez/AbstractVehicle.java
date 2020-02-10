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

    //Default constructor if the child class doesn't called the Super()
    public  AbstractVehicle() {
        fuel = 1;
    }

    //Abstract methods, the child needs to implement
    public abstract String getPath();
    public abstract String getName();

    public void move() {
        fuel--;
    }
    public void move(int steps) {
        fuel = fuel - steps;
    }

    public int getFuel() {
        return fuel;
    }

    public void addFuel(int i) {
        fuel = fuel + i;
    }
}
