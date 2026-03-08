package com.medium;
import java.util.Scanner;
public class ElementPresentorNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num of elements: ");
		int a = sc.nextInt();
		int arr[] = new int[a];
		System.out.print("Enter the elements: ");
		for(int i = 0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the key: ");
		int b = sc.nextInt();
		
		for(int i = 0; i<a;i++) {
			if(arr[i]==b) {
				System.out.print("true");
				sc.close();
				return;
			}
		}
		System.out.print("false");
		sc.close();
	}
	}
		
