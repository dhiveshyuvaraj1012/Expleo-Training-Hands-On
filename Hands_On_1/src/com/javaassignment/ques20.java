package com.javaassignment;
import java.util.Scanner;

public class ques20 {
	
	public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
		System.out.print("Enter hours: ");
		int hours = inp.nextInt();
		System.out.print("Enter minutes: ");
		int minutes = inp.nextInt();
		int totalMinutes = (hours * 60) + minutes;
		int totalCost = 0;
		if (totalMinutes > 420) {
			System.out.println("Browsing time exceeded. Maximum 7 hours allowed.");
		}
		else {
			if (totalMinutes >= 300) {
				int remainingMinutes = totalMinutes - 300;
				totalCost = 200 + (remainingMinutes * 1);
			}
			else {
				totalCost = totalMinutes * 1;
			}
			System.out.println("Total Bill:" + totalCost);
		}
		
	}

}
