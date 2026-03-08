package com.javaassignment;
import java.util.Scanner;
public class ques8 {

	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	System.out.print("Enter a char: ");
    char ch = inp.next().charAt(0);
    if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
    	System.out.println("It is an alphabet");
     }
     else if (ch >= '0' && ch <= '9') {
         System.out.println("It is a digit");
     }
     else {
         System.out.println("It is a special symbol");
     }

     inp.close();
 }
}
