package com.medium;
import java.util.Random;
public class DiceFreq {
	public static void main(String[] args) {
		int[] freq = new int[6];
		Random random = new Random();
		for(int i = 0; i<100;i++) {
			int dice = random.nextInt(6)+1;
			freq[dice-1]++;
		}
		System.out.println("Dice roll freq:");
		for(int i = 0; i<freq.length;i++) {
			System.out.println("Number " + (i+1) +" occured "+freq[i]+" times");
		}
	}

}
