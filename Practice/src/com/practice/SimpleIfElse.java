package com.practice;

import java.util.Scanner;

public class SimpleIfElse {
	public static void main(String[] args) {
		boolean seatAvailable = true;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the seat num: ");
		String SeatNumber = input.next();
		if(seatAvailable) {
			System.out.println("You have booked the seat number:" + SeatNumber);
		}
		else {
			System.out.println("You not booked");
		}
	}
}
