package com.javaassignment;
import java.util.Scanner;
public class ques6 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int count = 0;
		while(true) {
			System.out.print("Enter the integer: ");
			int num = input.nextInt();
			if(num<0) {
				break;
			}
			for (int i = 0; i<num;i++) {
				System.out.println("Hello");
				count++;
			}
		}
		System.out.println("Total Number: " +count);
		input.close();
				
	}

}
