package com.javaassignment;
import java.util.Scanner;
public class ques17 {

	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	System.out.print("Enter the total cost: ");
	int cost = inp.nextInt();
	double tot = 0;
	if(cost < 2000) {
      tot = cost * 0.05;
    }
    else if(cost < 5000) {
      tot = cost * 0.25;
    }
    else if(cost < 10000) {
      tot = cost * 0.35;
    }
    else {
      tot = cost * 0.50;
    }

	double amt = cost - tot;
	System.out.println("The total amt is: " +amt);
	}

}
