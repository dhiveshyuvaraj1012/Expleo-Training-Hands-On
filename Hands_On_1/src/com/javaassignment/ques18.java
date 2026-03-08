package com.javaassignment;
import java.util.Scanner;
public class ques18 {
	public static void main(String[] args) {
	 Scanner inp = new Scanner(System.in);
     System.out.print("Enter the car num: ");
     int number = inp.nextInt();
     if (number < 1000 || number > 9999) {
         System.out.println(number + " is not valid car number");
     } 
     else {
    	 int sum = 0;
         int temp = number;
         while (temp > 0) {
             sum += temp % 10;  
             temp = temp / 10;
         }
         if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
             System.out.println("It is Lucky Number");
         } 
         else {
             System.out.println("Not a lucky number");
         }
     }
}
}
