package com.easy;
import java.util.Scanner;
public class OddandEve {
	static void calculateSum(int n) {
		int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= n; i++) {
        	if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        calculateSum(n);
        sc.close();
    }
}

