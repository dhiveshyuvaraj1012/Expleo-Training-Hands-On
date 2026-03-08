package com.easy;
import java.util.Scanner;
public class ArrayFrequency {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of elements: ");
		int a = sc.nextInt();
		int[] arr = new int[a];   // array to store user input elements
		System.out.print("Enter the elements: ");
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		// outer loop selects each element and calculates its frequency
		for (int i = 0; i < a - 1; i++) {
			if (arr[i] == -1)  
				continue;
			int count = 1;
			
			// Inner loop compares current element with remaining elements
			for (int j = i + 1; j < a; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = -1;   
				}
			}
			
			System.out.println(arr[i] + "'s frequency is " + count);
		}
		if (arr[a - 1] != -1) {
			System.out.println(arr[a - 1] + "'s frequency is 1");
		}
		
		sc.close();
	}
}
