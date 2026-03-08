package com.javaassignment;
import java.util.Scanner;
public class ques22 {
	    public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter characters (numbers, uppercase, lowercase only): ");
	        String input = inp.nextLine();
	        char[] arr = input.toCharArray();
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - 1 - i; j++) {
	            	if (arr[j] > arr[j + 1]) {
	                    char temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	        System.out.println("Sorted Output:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}
