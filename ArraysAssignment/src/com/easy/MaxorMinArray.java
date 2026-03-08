package com.easy;
import java.util.Scanner;
public class MaxorMinArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num of ele: ");
		int a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter the elemcents: ");
		for(int i = 0; i<a;i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i<a;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Max numbers: "+max);
		System.out.println("Min numbers: "+min);
		sc.close();
	}
}
