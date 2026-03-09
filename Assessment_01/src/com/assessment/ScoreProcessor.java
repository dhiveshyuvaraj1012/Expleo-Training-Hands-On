package com.assessment;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreProcessor {
    static int processScore(int n){
        int val=0;
        if(n%9==0) val=4;
        if(n%10==3) val=Math.max(val,3);
        if(n%8==0) val=Math.max(val,2);
        if(n%2==0) val=Math.max(val,0);
        if(n%2!=0) val=Math.max(val,1);
        return val;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> scores=new ArrayList<>();
        System.out.println("Enter scores (-1 to stop):");
        while(true){
            int n=sc.nextInt();
            if(n<0) break;
            scores.add(n);
        }

        System.out.print("Scores before processing: ");
        for(int s:scores) System.out.print(s+" ");
        System.out.println();

        System.out.print("Scores after processing: ");
        for(int s:scores) System.out.print(processScore(s)+" ");
    }
}