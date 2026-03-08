package com.javaassignment;
import java.util.Scanner;
public class ques16 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the digit: ");
		int num = inp.nextInt();
		int orig = num;
		int dig1 = num % 10;
		num = num / 10;
		int dig2 = num % 10;     
		num = num / 10;
		int dig3 = num % 10;      
		int tot = (dig1*dig1*dig1) + (dig2*dig2*dig2) + (dig3*dig3*dig3);
		if(tot==orig) {
			System.out.println("It is armstrong number.");
		}
		else {
			System.out.println("It is not.");
		}
	}

}
