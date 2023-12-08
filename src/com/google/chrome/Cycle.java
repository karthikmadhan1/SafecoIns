package com.google.chrome;

public class Cycle {
	
	public void ride() {
		System.out.println("Ride in the Cycle");	
	}
	
	public void wheelie () {
		System.out.println("Wheelie in the Cycle");
	}
	
	public void carryLoad() {
		System.out.println("Carry Load in the Cycle");
		}
	
	public void braking() {
		System.out.println("Braking in the Cycle");
		}
		
	public static void main(String[]args) {
	
		Cycle bicycle=new Cycle();
				bicycle.ride();
				bicycle.wheelie();
				bicycle.carryLoad();
				bicycle.braking();
	}
	
}