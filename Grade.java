package com.apj;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks of Mathematics:");
        int a= sc.nextInt();
        System.out.println("Enter the marks of Compiler:");
        int b= sc.nextInt();
        System.out.println("Enter the marks of AI:");
        int c= sc.nextInt();

        int total= a+b+c;
        System.out.println("total marks:" +total);
        int avg=total/3;
        System.out.println("average marks:" +avg);


        if(avg>=90){
            System.out.println("A grade");
        }
        else if(avg>=70){
            System.out.println("B grade");
        }
        else if(avg>=50){
            System.out.println("C grade");
        }
        else{
            System.out.println("FAIL...");
        }
        sc.close();
    }
}
