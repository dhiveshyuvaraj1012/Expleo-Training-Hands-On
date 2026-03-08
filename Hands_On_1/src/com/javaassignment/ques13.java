package com.javaassignment;
import java.util.Scanner;
public class ques13 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the price: ");
		int price = inp.nextInt();
		System.out.print("Enter the quantity: ");
		int quant = inp.nextInt();
		int amt = price * quant;
		double disc;
		if(amt>1000) {
			disc = amt * 0.10;
		}
		else {
			disc = amt*0.05;
		}
		double paid = amt - disc;
		System.out.println("Paid amount is: " +paid);
		

	}

}
