package com.javaassignment;
import java.util.Scanner;

public class ques1 {
      public static void main(String[] args) {
    	  Scanner input = new Scanner (System.in);
    	  System.out.print("Enter employee ID:");
    	  int empId = input.nextInt();
    	  
    	  System.out.print("Enter employee name:");
    	  String empName = input.next();
    	  
    	  System.out.print("Enter Daily Wages:");
    	  Double empWages = input.nextDouble();
    	  
    	  System.out.print("Enter number of work days:");
    	  int empDays = input.nextInt();
    	  
    	  double totalSalary = empWages * empDays;
    	  System.out.println("\nEmployee Salary Details:");
          System.out.println("Employee ID: " + empId);
          System.out.println("Employee Name: " + empName);
          System.out.println("Daily Wages: " + empWages);
          System.out.println("Days Worked: " + empDays);
          System.out.println("Total Salary: " + totalSalary);

          input.close();
    	  
  
    	  }
}
