package com.easy;
import java.util.Scanner;
public class VotingEligible {
	static void checkEligible(int age) {
		if(age>=18) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		checkEligible(age);
		sc.close();
	}
}
