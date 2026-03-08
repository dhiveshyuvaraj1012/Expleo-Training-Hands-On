package com.OOPs;

public class TheatreScreen {
	private static int totalSeats = 20; //Static var
	TheatreScreen(){
		System.out.println("Current seat avalilability: " +totalSeats);
	}
	public void DisplayTheatreScreen() {
		System.out.println("Current seat availability: " +totalSeats);
	}
	public static void BookTicket(int nooftickets) { 
		//Static method
		System.out.println("No.of Seats Booked: " +nooftickets);
		totalSeats -= nooftickets;
	}
	public static void main(String[] args) {
		System.out.println("Screen ticket availability: ");
		TheatreScreen TS1 = new TheatreScreen();
		TS1.BookTicket(4);
		TheatreScreen TS2 = new TheatreScreen();
		TS2.BookTicket(5);
		TS2.DisplayTheatreScreen();
	}
	

}
