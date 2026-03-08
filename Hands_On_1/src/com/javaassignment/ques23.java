package com.javaassignment;
import java.util.Scanner;
public class ques23 {
	    public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    int num = inp.nextInt();
	    if (num <= 0) {
	    	System.out.println("Invalid Input");
	        return;
	        }
	    int i = 1;

	    while (num > 1) {
	    	if (num % i != 0) {
	        System.out.println("Sorry. The given number is not a perfect factorial");
	        return;
	            }
	    	num = num / i;
	        i++;
	        }
	    System.out.println(i - 1);
	    }
	}
