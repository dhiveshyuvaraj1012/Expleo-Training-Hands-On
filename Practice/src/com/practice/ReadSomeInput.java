package com.practice;
import java.util.*;

public class ReadSomeInput {
	public static void main(String[]args) {
		Scanner console = new Scanner (System.in);
		System.out.print("Enter your name: ");
		String name = console.nextLine();
		System.out.println("Hi, "+name+" Welcome to program");
		console.close();
	}
}
