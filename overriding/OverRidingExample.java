package com.digitek.overriding;

public class OverRidingExample {

	public static void main(String[] args) {
		Bank Chase = new ChaseBank ();
		
		System.out.println(Chase.getInterestRate());
	}

}
