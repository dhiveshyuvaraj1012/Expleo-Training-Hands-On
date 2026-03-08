package com.javaassignment;
import java.util.Scanner;
public class ques15 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the str: ");
		String str = inp.nextLine();
		int letters = 0;
		int digits = 0;
		int othersymbols = 0;
		for(int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isLetter(ch)) {
				letters++;
			}
			else if(Character.isDigit(ch)) {
				digits++;
			}
			else {
				othersymbols++;
			}
			
		}
		System.out.println("Letters: " +letters+" Digits: " +digits+ " Other Symbols: " +othersymbols);
	}

}
