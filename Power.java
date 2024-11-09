package com.apj;
import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base:");
        int x= sc.nextInt();
        System.out.println("Enter power:");
        int n= sc.nextInt();

        double value=Math.pow(x, n);
        System.out.println(value);

        sc.close();
    }
}
