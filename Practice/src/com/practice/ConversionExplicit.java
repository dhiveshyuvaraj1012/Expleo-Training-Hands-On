package com.practice;

public class ConversionExplicit {
	public static void main(String[] args) {
		double d  = 100.04;
		long l = (long)d;  //convert double to long
		int i = (int)l; //long conversion into int
		System.out.println("Double value " +d);
		System.out.println("Long value " +l);
		System.out.println("Int value " +i);
	}
}
