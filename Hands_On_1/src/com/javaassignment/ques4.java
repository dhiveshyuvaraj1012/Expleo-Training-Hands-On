package com.javaassignment;
import java.util.Scanner;

public class ques4 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the num: ");
		int val = inp.nextInt();
		
		int sum = 0;
		int num = 1;
		do {
			sum = sum+num;
			num++;
		}while(num<=val);
		   System.out.println("Series of 1 to " + val + " is " + sum);
		inp.close();
		} 
	}
