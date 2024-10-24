package com.apj;
import java.util.Scanner;
public class Strongno {
    public static int factorial (int n){
        int fact=1;
        for(int i=1; i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    
    public static void Strong(int n){
        int sum =0,r=n, digit ;
        while(r>0){
            digit=r%10;
            sum+=factorial(digit);
            r/=10;
        }
        if(sum==n)
        {
            System.out.println(n+" is a strong no.");
        }
        else{
            System.out.println(n+" is not a strong no.");
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no. you want to check:");
        int n=sc.nextInt();
        Strong(n);
        sc.close();

    }
}
