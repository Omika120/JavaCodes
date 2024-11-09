package com.apj;
import java.util.*;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n=sc.nextInt();
        int sum_odd=oddsum(n);
        System.out.println("Sum of odd no.s from 1 to "+n+" is "+sum_odd);
        sc.close();
    }

    public static int oddsum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
}
