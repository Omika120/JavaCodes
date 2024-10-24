package com.apj;
import java.util.Scanner;
public class Leapyear {
    public static void Leap(int n){
        if(((n%4==0)&& (n%100!=0))||(n%400==0))
        {
            System.out.println(n+" is a leap year");
        }
        else{
            System.out.println(n+" is not a leap year");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year:");
        int n=sc.nextInt();
        Leap(n);
        sc.close();
    }
}
