package com.easy;
/**
 * Even numbers and Odd Numbers are initiated in the class
 */
public class AddEvenOdd {
	public static void main(String[] args) {
		int [] even = new int[] {2,4,6,8,10};
		int [] odd = new int[] {1,3,5,9};
		int evenSum = 0, oddSum = 0;
		for(int i = 0; i<even.length;i++) {
			evenSum+=even[i];
		}
		for(int i = 0; i<odd.length;i++) {
			oddSum+=odd[i];
		}
		System.out.println("Sum of even numbers: " +evenSum);
		System.out.println("Sum of odd numbers: " +oddSum);
	}
}
