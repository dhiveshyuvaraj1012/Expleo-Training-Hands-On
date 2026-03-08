package com.hard;
import java.util.Scanner;
public class EqualNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr [] = new int[N];
		int total = 0;
		for(int i = 0; i<N;i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		if(total%N ==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		sc.close();
	}

}
