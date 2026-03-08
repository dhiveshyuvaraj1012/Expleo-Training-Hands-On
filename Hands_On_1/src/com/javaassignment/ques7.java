package com.javaassignment;
import java.util.Scanner;

public class ques7 {
	public static void main(String[] args) {
	Scanner inp = new Scanner (System.in);
	System.out.print("Enter your age: ");
	int voteAge = inp.nextInt();
	System.out.print("Enter your weight: ");
	double voteWt = inp.nextDouble();
	if(voteAge>=18&&voteAge<=55&&voteWt>45) {
		System.out.println("You are eligible to vote");
	}
	else {
		System.out.println("You are not eligible to vote");
	}
	inp.close();
	}
}
