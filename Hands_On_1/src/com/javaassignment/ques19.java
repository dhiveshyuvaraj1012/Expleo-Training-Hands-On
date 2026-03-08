package com.javaassignment;
import java.util.Scanner;
public class ques19 {

	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	System.out.println("Num of pages typed: ");
	int numPages = inp.nextInt();
	System.out.println("Num of copies: ");
	int numCopies = inp.nextInt();
	int typingCost,printingCost,total,firstCopy,remainingCost;
	typingCost = numPages*3;
	if(numCopies==1) {
		printingCost = numPages*1;
	}
	else {
		firstCopy = numPages*1;
		remainingCost = numPages*(numCopies-1)*3;
		printingCost = firstCopy + remainingCost;
	}
	total = typingCost + printingCost;
	System.out.println("Total: "+total);
	}

}
