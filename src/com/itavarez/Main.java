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

		HorseFromVehicle trigger = new HorseFromVehicle("Trigger", 10);
		HorseFromVehicle seattleSlew = new HorseFromVehicle("Seattle Slew", 10);
		HorseFromVehicle americanPharoah = new HorseFromVehicle("American Pharoah", 10);


		Auto vw = new Auto(1, "EuroVan", 2000);
		Auto toyota = new Auto(10, "Tundra", 1998);
		Auto honda = new Auto (5, "Accord", 2003);

		ArrayList<AbstractVehicle> myList = new ArrayList<AbstractVehicle>();
		myList.add(secretariat);
		myList.add(trigger);
		myList.add(seattleSlew);
		myList.add(americanPharoah);
		myList.add(eclipse);
		myList.add(vw);
		myList.add(toyota);
		myList.add(honda);

		System.out.println();
		System.out.println("*** This List ***");
		System.out.println(myList.toString());
    }
}
