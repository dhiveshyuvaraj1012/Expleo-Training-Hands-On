/**
 * Demonstrates method overloading
 */
package com.OOPs;
public class Demo {
	static int add (int a, int b) {
		return a+b;
	}
	static double add(double a, double b) {
		return a + b;
	}
	public static void main(String[] args) {
		System.out.println("Integer: " +add(10,30));
		System.out.println("Double: " +add(3.5,2.3) );
	}
}

