package com.assessment;
import java.util.Scanner;

public class DingDong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start and end numbers: ");
        int start=sc.nextInt(), end=sc.nextInt();
        for(int i=start;i<=end;i++){
            if(i%10==0) System.out.print("dong ");
            else if(i%5==0) System.out.print("ding ");
            else System.out.print(i+" ");
        }
    }
}