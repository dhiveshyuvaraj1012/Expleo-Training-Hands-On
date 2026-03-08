package com.practice;

public class IfElseControlStructure {

	public static void main(String[] args) {
		boolean isMoving = true;
		int currentSpeed = 10;
		if(isMoving) {
			currentSpeed--;
			System.out.println("The speed reduced");
		}
		else {
			System.out.println("The speed stopped");
		}

	}

}
