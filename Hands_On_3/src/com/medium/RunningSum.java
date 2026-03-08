package com.medium;
import java.util.Scanner;
public class RunningSum {
	    static int sumOdd(int lower, int upper) {
	    	int oddSum = 0;
	    	for (int i = lower; i <= upper; i++) {
	    		if (i % 2 != 0) {
	                oddSum += i;
	            }
	        }
	    	return oddSum;
	    }

	    static int sumEven(int lower, int upper) {
	    	int evenSum = 0;
	    	for (int i = lower; i <= upper; i++) {
	    		if (i % 2 == 0) {
	                evenSum += i;
	            }
	        }
	    	return evenSum;
	    }
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Enter lower bound: ");
	        int lower = sc.nextInt();
	        System.out.print("Enter upper bound: ");
	        int upper = sc.nextInt();
	        int oddSum = sumOdd(lower, upper);
	        int evenSum = sumEven(lower, upper);
	        int difference = Math.abs(oddSum - evenSum);

	        System.out.println("The sum of odd numbers from " + lower + " to " + upper + " is: " + oddSum);
	        System.out.println("The sum of even numbers from " + lower + " to " + upper + " is: " + evenSum);
	        System.out.println("The absolute difference between the two sums is: " + difference);
	        sc.close();
	    }
	}
