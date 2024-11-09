package com.apj;
import java.util.*;

public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        if (age<18){
            System.out.println("NOT ELIGIBLE TO VOTE");
        }
        else{
            System.out.println("Eligible to vote");
        }
        sc.close();
    }
    
}
