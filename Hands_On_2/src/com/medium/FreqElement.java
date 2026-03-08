/*
 * Program to find how many times the elements occurred
 */
package com.medium;

public class FreqElement {
	public static void main(String[] args) {
		int[] my_record = {10,10,10,10,20,20,20,20,40,40,50,50,30};
		for (int i = 0; i<my_record.length;i++) {
			int count = 1;
			int j;
			for(j=0;j<i;j++) {
				if(my_record[i] == my_record[j]) {
					break;
				}
			}
			if(j<i)
				continue;
			for(j=i+1;j<my_record.length;j++) {
				if(my_record[i]==my_record[j]) {
					count++;
				}
			}
			 System.out.println(my_record[i] + " occurs " + count + " times");
		}
	}

}
