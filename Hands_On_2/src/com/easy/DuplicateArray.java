package com.easy;
import java.util.Scanner;
public class DuplicateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the num.of elements:");
		int a = sc.nextInt();
		int [] arr = new int[a];
		System.out.print("Enter the elements:");
		// stores elements correctly using index 
		for(int i = 0; i<a;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Duplicate elements are:");
		for(int i = 0;i<a-1;i++) {
			for(int j = i+1;j<a;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break; //prevents printing same duplicate values
				}
			}
		}
		sc.close();
	}
}
