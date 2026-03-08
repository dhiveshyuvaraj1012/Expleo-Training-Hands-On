package com.javaassignment;
import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("Enter the letter: ");
	char letter = input.next().charAt(0);
	
	switch(letter) {
	
    // Uppercase
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
	// Lowercase
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
    	System.out.println("It is a vowel");
    	break;
    default:
    	if ((letter>='a'&&letter<='z' || letter>='A'&&letter<='Z')) {
    		System.out.println("It is a consonant");
    	}
    	else {
    		System.out.println("It is a symbol");
    	}
	}
	input.close();
	}

}
