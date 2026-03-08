/*
 * Program to search and count the array
 */
package com.medium;
import java.util.Scanner;
public class SearchAndCount {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[25];
		System.out.println("Enter the 25 no's: ");
		for(int i = 0; i<25;i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Enter number to search: ");
		int search = sc.nextInt();
		int count = 0;
		for(int i = 0;i<25;i++) {
			if(arr[i]==search) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(search+" appears "+count+" times ");
		} else {
			System.out.println("Number not found");
		}
		sc.close();
	}
}
