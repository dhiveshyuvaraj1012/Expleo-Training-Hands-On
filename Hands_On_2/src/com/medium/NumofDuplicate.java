/*
 * Program for Finding Num.of Duplicate Arrays
 */
package com.medium;
import java.util.Scanner;
public class NumofDuplicate{
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter array size: ");
		        int n = sc.nextInt();
		        int[] arr = new int[n];
		        System.out.println("Enter array elements: ");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }
		        int duplicate = 0;
		        int unique = 0;
		        for (int i = 0; i < n; i++) {
		        	int count = 0;
		        	for (int j = 0; j < n; j++) {
		                if (arr[i] == arr[j]) {
		                    count++;
		                }
		            }

		            int previousCount = 0;
		            for (int k = 0; k < i; k++) {
		                if (arr[i] == arr[k]) {
		                    previousCount++;
		                }
		            }

		            if (previousCount == 0) {
		                if (count > 1) {
		                    duplicate++;
		                } else {
		                    unique++;
		                }
		            }
		     }

		    System.out.println("No of duplicate element: " + duplicate);
		    System.out.println("No of unique elements: " + unique);
		    sc.close();
		    }
}
