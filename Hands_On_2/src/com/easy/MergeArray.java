package com.easy;
import java.util.Scanner;
public class MergeArray {
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
		int[] merge = new int[a+b];
		for(int i = 0; i<a;i++) {
			merge[i] = arr1[i];
			}
		for(int i = 0; i<b;i++) {
			merge[a+i] = arr2[i];
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
		System.out.print("Merged Array:");
		for(int i =0;i<a+b;i++) {
			System.out.println(merge[i]+" ");
		}
		
		 System.out.println();
		sc.close();
		}
	}
