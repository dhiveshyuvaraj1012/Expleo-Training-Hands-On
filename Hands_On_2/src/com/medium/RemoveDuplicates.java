package com.medium;
import java.util.Scanner;
public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements: ");
		for(int i = 0; i<n;i++) {
			 arr[i] = sc.nextInt();
		}
		int count = 0;
		int[] unique = new int [n];
		for(int i = 0;i<n;i++) {
			int found = 0;
			for(int j=0;j<count;j++) {
				if(arr[i] == unique[j]) {
					found = 1;
					break;
				}
			}
			if(found==0) {
				unique[count] = arr[i];
				count++;
			}
		}
		System.out.println("New list with unique: ");
		for(int i = 0;i<count;i++){
			System.out.print(unique[i] +" ");
		}
		sc.close();
	}

}
