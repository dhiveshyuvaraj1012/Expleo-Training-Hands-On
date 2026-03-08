package com.javaassignment;
import java.util.Scanner;
public class ques2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		
		if(num%7==0) {
			System.out.println("It is divisible");
		}
		if(num%7!=0) {
			System.out.println("It is not divisible");
		}
		input.close();
	}

}
