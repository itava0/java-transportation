package com.itavarez;

import java.util.*;

public class Main {

    public static void main(String[] args) {
		System.out.println("\n*** From Interfaces Classes ***");
		//Creating new Objects
	    Horse seabiscuit = new Horse("Seabiscuit");
	    Horse affirmed = new Horse("Affirmed");
	    Horse joe = new Horse("Joe");

	    seabiscuit.eat(10);
	    affirmed.eat(25);
	    for(int i = 0; i < 3; i++ ) {
	        seabiscuit.move();
        }
	    System.out.println("Seabiscuit " + seabiscuit.getFuelLevel());

	    System.out.println("\n*** From Abstract Class ***");
		//Creating new Objects
	    HorseFromVehicle secretariat = new HorseFromVehicle("Secretariat", 10);
	    secretariat.addFuel(10);
	    System.out.println("Secretariat " + secretariat.getFuel());

	    HorseFromVehicle eclipse = new HorseFromVehicle("Eclipse");
	    System.out.println("Eclipse " + eclipse.getFuel());

    }
}
