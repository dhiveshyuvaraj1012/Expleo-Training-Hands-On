package com.javaassignment;

public class ques5 {

	public static void main(String[] args) {
		for (char fir = 'a', sec = 'z'; 
	             fir <= 'z' && sec >= 'a'; 
	             fir++, sec--) {

	            System.out.print("" + fir + sec + " ");
		}
	}
}
