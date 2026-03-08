package com.medium;
import java.util.Scanner;
public class SugarFactory {
	static int calculateOvertime(int hours) {
		int rate = 15;   // Overtime rate per hour
		if (hours > 40) {
	        int overtimeHours = hours - 40;
	           return overtimeHours * rate;
	           } else {
	            return 0;
	        }
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter working hours for employee " + i + ": ");
	        int hours = sc.nextInt();
	        int overtimePay = calculateOvertime(hours);
	        System.out.println("Overtime pay for employee " + i + " is: Rs." + overtimePay);
	        }
	    }
	}

