package com.javaassignment;
import java.util.Scanner;
public class ques12 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Price per item: ");
		int price= inp.nextInt();
		System.out.print("Quantity Purchased: ");
		int quantity = inp.nextInt();
		int total = price * quantity;
		double amt;
		if(quantity>500) {
			double discount = total*0.15;
			amt = total - discount;
		}
		else {
			amt = total;
		}
		System.out.println("Total: " +amt);

	}

}
