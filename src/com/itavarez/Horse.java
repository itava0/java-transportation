package com.itavarez;

public class Horse implements Vehicle, Animal {

    //class attribute
    private int fuel = 0;
    private String name;

    //Constructor
    public Horse(String name) {
        this.name = name; // Set the initial value for the class attribute name
    }

    //Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move() {
        fuel = fuel -1;
    }

    @Override
    public void eat(int i) {
        fuel = fuel + i;
    }

    @Override
    public String speak() {
        return "Neigh";
    }

    @Override
    public String getPath() {
        return "Grass";
    }

    @Override
    public int getFuelLevel() {
        return fuel;
    }

    @Override
    public void addFuel(int i) {
        eat(i);
    }
}
