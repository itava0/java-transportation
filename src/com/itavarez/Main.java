package com.itavarez;

import java.util.*;

public class Main {
	public static ArrayList<AbstractVehicle> filteredList = new ArrayList<AbstractVehicle>();
	public static void printVehicles(ArrayList<AbstractVehicle> vehicles, CheckVehicle tester) {

		filteredList.clear();
		for (AbstractVehicle v: vehicles) {
			if (tester.test(v)) {
				System.out.println(v.getName() + " " + v.getFuel());
				filteredList.add(v);
			}
		}
	}
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
	    eclipse.move(10);

		HorseFromVehicle trigger = new HorseFromVehicle("Trigger", 10);
		HorseFromVehicle seattleSlew = new HorseFromVehicle("Seattle Slew", 10);
		HorseFromVehicle americanPharoah = new HorseFromVehicle("American Pharoah", 10);


		Auto vw = new Auto(1, "EuroVan", 2000);
		vw.move();
		vw.move(5);
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

		//Filter list
		//getFuelLevel() < 0
		System.out.println();
		System.out.println("*** Filter List ***");
		// I'm passing the Array myList, and filter it based on their fuel level
		printVehicles(myList, v -> (v.getFuel() < 0)); // returns boolean

		System.out.println("\nHorse with positive Fuel");
		printVehicles(myList, v -> (v.getFuel() > 0) && (v  instanceof HorseFromVehicle));
    }
}
