package com.assessment;
import java.util.Scanner;

public class LuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of Participants: ");
        int n = sc.nextInt();
        int[] tokens = new int[n];
        System.out.print("Token Numbers: ");
        for(int i=0;i<n;i++) tokens[i]=sc.nextInt();

        int first=0, second=0, third=0;
        for(int t: tokens) {
            int sum=0, temp=t;
            while(temp>0){ sum+=temp%10; temp/=10; }
            if(sum==7) first=t;
            else if(sum==5) second=t;
            else if(sum==3) third=t;
        }

        System.out.println("First Prize is to token: "+first);
        System.out.println("Second Prize is to token: "+second);
        System.out.println("Third Prize is to token: "+third);
    sc.close();
    } 
}
