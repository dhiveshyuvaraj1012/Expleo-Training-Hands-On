package com.practice;
import java.util.Scanner;
public class SimpleIf {
	public static void main(String[] args) {
		boolean seatAva = true;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Seat Number: ");
		String SeatNum = input.nextLine();
		if(seatAva) {
			System.out.println("Entered Seat Num: " +SeatNum);
		}
		input.close();
	}

}
