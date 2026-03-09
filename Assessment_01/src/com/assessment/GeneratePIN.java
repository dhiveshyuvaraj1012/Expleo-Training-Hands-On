package com.assessment;
import java.util.Scanner;

public class GeneratePIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i=0;i<3;i++) nums[i]=sc.nextInt();

        int[] digits = new int[3]; // temp array for digits
        int[] hundreds = new int[3], tens = new int[3], units = new int[3];
        int maxDigit = 0;
        for(int i=0;i<3;i++){
            int num = nums[i];
            units[i] = num%10; num/=10;
            tens[i] = num%10; num/=10;
            hundreds[i] = num%10;
            while(num>0){ if(num%10>maxDigit) maxDigit=num%10; num/=10; }
        }

        int pin = maxDigit*1000 
                + Math.min(hundreds[0], Math.min(hundreds[1], hundreds[2]))*100
                + Math.min(tens[0], Math.min(tens[1], tens[2]))*10
                + Math.min(units[0], Math.min(units[1], units[2]));

        System.out.println("PIN = "+pin);
        sc.close();
    }
}
