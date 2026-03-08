package com.medium;
import java.util.Scanner;
public class Eligible {
	static void checkEligible(int age, double weight) {
		if(age>18&&age<=55 && weight>45) {
			System.out.println("Eligible");
		} else {
			System.out.println("Not Eligible");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Age: ");
		int age = sc.nextInt();
		System.out.print("Weight: ");
		double weight = sc.nextDouble();
		checkEligible(age,weight);
	sc.close();	
	}
}
