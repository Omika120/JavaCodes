package com.apj;
import java.util.Scanner;

public class ThrowEx {
    public static  void fun(int n){
        if(n==2){
        throw new ArithmeticException();}
        else{
            System.out.println("NO. IS:"+n);
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no.:");
        int n=sc.nextInt();


        try{
            fun(n);
        }
        catch(ArithmeticException e){
            System.out.println("Enter n other then 2");

        }
        sc.close();
    }
}
