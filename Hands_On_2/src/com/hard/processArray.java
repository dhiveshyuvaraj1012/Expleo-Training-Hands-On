package com.hard;
import java.util.Scanner;
public class processArray {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int[] arr = new int [100];
	int count = 0;
	while(true) {
		int num = sc.nextInt();
		if(num<0) {
			break;
		}
		arr[count] = num;
		count++;
	}
	int[] finalArray = new int[count];
	for(int i =0; i<count; i++) {
		finalArray[i] = arr[i];
	}
	processArray(finalArray);
	for(int i = 0 ;i<finalArray.length;i++) {
		System.out.print(finalArray[i]+" ");
	}
	sc.close();
	}
	
	 public static void processArray(int[] arr) {

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] % 7 == 0 && arr[i] % 8 == 0) {
	                arr[i] = -6;
	            }
	            else if (arr[i] % 7 == 0) {
	                arr[i] = -2;
	            }
	            else if (arr[i] % 8 == 0) {
	                arr[i] = -9;
	            }
	  }
	    }
	}
