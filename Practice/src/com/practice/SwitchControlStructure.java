package com.practice;

public class SwitchControlStructure {

	public static void main(String[] args) {
		int letter = 'A';
		switch(letter) {
		    case 'a':
		    	System.out.println("Lowercase letter");
		    	break;
		    case 'A':
		    	System.out.println("Uppercase letter");
		    	break;
		    default:
				System.out.println("Not available");
				break;
		}

	}

}
