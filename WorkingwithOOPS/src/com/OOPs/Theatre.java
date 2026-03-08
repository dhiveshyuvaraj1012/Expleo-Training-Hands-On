/*
 * Example demonstrates how to create a object for the class
 */
package com.OOPs;

public class Theatre {
	int theatreId = 1012;
	String theatreName = "KS";
	String theatreLoc = "Salem";
	
	public void displayTheatre() {
		System.out.println("Theatre ID: " +theatreId);
		System.out.println("Theatre Name: " +theatreName);
		System.out.println("Theatre Location: " +theatreLoc);
	}
	 public static void main(String[] args) {
	        Theatre t = new Theatre();
	        t.displayTheatre(); 
	 }
}
