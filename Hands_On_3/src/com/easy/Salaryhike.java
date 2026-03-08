package com.easy;
import java.util.Scanner;
public class Salaryhike{
	    static void calculateNewSalary(double oldSalary, double hikePercent) {
	    	double newSalary = oldSalary + (oldSalary * hikePercent / 100);
	    	System.out.println("Old Salary: " + oldSalary);
	        System.out.println("Hike Percentage: " + hikePercent + "%");
	        System.out.println("New Salary: " + newSalary);
	    }
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Enter old salary per month: ");
	        double oldSalary = sc.nextDouble();
	        System.out.print("Enter hike percentage: ");
	        double hikePercent = sc.nextDouble();
	        calculateNewSalary(oldSalary, hikePercent);
	        sc.close();
	    }
	}
