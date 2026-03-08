package com.hard;
import java.util.Scanner;
public class Placement {
	    static void findHighest(int cs, int ec, int me) {
	    	if (cs < 0 || ec < 0 || me < 0) {
	            System.out.println("Input is Invalid");
	            return;
	        }
	        if (cs == ec && ec == me) {
	            System.out.println("None of the department has got the highest placement");
	            return;
	        }
	        int max = cs;
	        if (ec > max) {
	            max = ec;
	        }
	        if (me > max) {
	            max = me;
	        }
	        System.out.print("Highest placement ");
	        if (cs == max) {
	            System.out.print("CS ");
	        }
	        if (ec == max) {
	            System.out.print("EC ");
	        }
	        if (me == max) {
	            System.out.print("ME ");
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the no of students placed in CS:");
	        int cs = sc.nextInt();

	        System.out.print("Enter the no of students placed in EC:");
	        int ec = sc.nextInt();

	        System.out.print("Enter the no of students placed in ME:");
	        int me = sc.nextInt();

	        findHighest(cs, ec, me);
	        sc.close();
	    }
	}
