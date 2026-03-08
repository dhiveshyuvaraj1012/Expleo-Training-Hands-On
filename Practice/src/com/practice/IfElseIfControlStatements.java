package com.practice;
import java.util.Scanner;

public class IfElseIfControlStatements {

	public static void main(String[] args) {
		String seattype;
		System.out.println("Type of Avalilable\nREGULAR\nPREMIUM\nEXECUTIVE\nVIP\nchoose any one of the option: ");
		Scanner input = new Scanner(System.in);
		seattype = input.next();
		if(seattype.equals("REGULAR")) {
			System.out.println("You have selected Regular Seat and cost is Rs.80");
		}
		else if(seattype.equals("PREMIUM")) {
			System.out.println("You have selected Premium Seat and cost is Rs.100");
		}
		else if(seattype.equals("EXECUTUVE")) {
			System.out.println("You have selected Executive Seat and cost is Rs.180");
		}
		else if(seattype.equals("VIP")) {
			System.out.println("You have selected VIP Seat and cost is Rs.300");
		}
		else {
			System.out.println("You have not selected any seat");
		}
	
	input.close();
	}
}
