package com.javaassignment;
import java.util.Scanner;
public class ques9 {

	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	System.out.println("Enter the integer: ");
	int num = inp.nextInt();
	int sum = 0;
	while(num>0) {
		int dig = num%10;
		sum = sum + dig;
		num = num/10;
	}
	System.out.println("Sum: " +sum);
	}
	

}
