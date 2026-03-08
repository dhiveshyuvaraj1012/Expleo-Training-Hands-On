package com.hard;
import java.util.Scanner;
public class MergeAndSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.of the ele in first arr: ");
		int a = sc.nextInt();
		int [] arr1 = new int[a];
		System.out.print("Enter the elements");
		for(int i = 0; i<a;i++) {
			 arr1[i] = sc.nextInt();
		}
		System.out.print("Enter no.of the ele in sec arr: ");
		int b = sc.nextInt();
		int [] arr2 = new int[a];
		System.out.print("Enter the elements");
		for(int i = 0; i<b;i++) {
			 arr2[i] = sc.nextInt();
		}
		
		System.out.print("Enter no.of the ele in third arr: ");
		int c = sc.nextInt();
		int [] arr3 = new int[b];
		System.out.print("Enter the elements");
		for(int i = 0; i<c;i++) {
			 arr3[i] = sc.nextInt();
		}
		int[] merge = new int[a+b+c];
		for(int i = 0; i<a;i++) {
			merge[i] = arr1[i];
			}
		for(int i = 0; i<b;i++) {
			merge[a+i] = arr2[i];
		}
		for(int i =0;i<c;i++) {
			merge[i] = arr3[i];
		}
		System.out.print("First array: ");
		for(int i =0;i<a;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.print("Second array: ");
		for(int i =0;i<b;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.print("Third array: ");
		for(int i =0;i<c;i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		System.out.print("Merged Array:");
		for(int i =0;i<a+b+c;i++) {
			System.out.println(merge[i]+" ");
		}
		 System.out.println();
		 sc.close();	}

}
