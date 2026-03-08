package com.javaassignment;
import java.util.Scanner;

public class ques21 {

	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	double sum = 0;
	int count = 0;
	while(true) {
		System.out.print("Enter exercise grade: ");
		double exe = inp.nextDouble();
		System.out.print("Enter exam grade: ");
		double exa = inp.nextDouble();
		if(exe == -1||exa==-1) {
			break;
		}
		if(exe<0||exe>10||exa<0||exa>10) {
			System.out.println("Invalid grade. Grades must be between 0 and 10.");
            continue;
		}
		double finalGrade;
		if(exe>=5&&exa>=5) {
			finalGrade = (0.3*exe)+(0.7*exa);
		}
		else {
			if(exe<exa) {
				finalGrade = exe;
			}
			else {
				finalGrade = exa;
			}
		}
		 System.out.println("Final Grade: " + finalGrade);
		 sum = sum+finalGrade;
		 count = count+1;
	}
	     if (count > 0) {
	    	 System.out.println("Avg Grade: " + (sum / count));
     }   else {
    	 System.out.println("No valid students entered.");
     }

	}

}
