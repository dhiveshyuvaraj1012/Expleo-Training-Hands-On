package com.hard;
import java.util.Scanner;
public class SalaryIncreement {
	static double calculateIncrement(double salary, double rating) {
		if (salary <= 0 || rating < 1 || rating > 10) {
			return -1;
	        }
		double incrementPercent = 0;
		if (rating >= 1 && rating <= 4) {
	            incrementPercent = 10;
	        } 
	    else if (rating > 4 && rating <= 7) {
	            incrementPercent = 25;
	        } 
	    else if (rating > 7 && rating <= 10) {
	            incrementPercent = 30;
	        }
		return salary + (salary * incrementPercent / 100);
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Enter the salary: ");
	        double salary = sc.nextDouble();
	        System.out.print("Enter the appraisal rating: ");
	        double rating = sc.nextDouble();
	        double result = calculateIncrement(salary, rating);
	        if (result == -1) {
	            System.out.println("Invalid Input");
	        } else {
	            System.out.println((int) result);
	        }
	    }
	}
