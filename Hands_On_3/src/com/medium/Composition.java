package com.medium;
import java.util.Scanner;
public class Composition {
	    static void printPrimes(int x, int y) {
	    	if (x > y) {
	            System.out.println("Provide valid input");
	            return;
	        }
	    	for (int num = x; num <= y; num++) {
	    		if (num < 2) {
	                continue;  
	            }
	    		int count = 0;
	    		for (int i = 2; i <= num / 2; i++) {
	    			if (num % i == 0) {
	                    count++;
	                    break;
	                }
	            }

	            if (count == 0) {
	                System.out.print(num + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int x = sc.nextInt();
	        int y = sc.nextInt();

	        printPrimes(x, y);
	        sc.close();
	    }
	}


