package com.itavarez;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Horse seabiscuit = new Horse("Seabiscuit");
	    Horse affirmed = new Horse("Affirmed");
	    Horse joe = new Horse("Joe");

	    seabiscuit.eat(10);
	    affirmed.eat(25);
	    for(int i = 0; i < 3; i++ ) {
	        seabiscuit.move();
        }
	    System.out.println("Seabiscuit " + seabiscuit.getFuelLevel());
    }
}
