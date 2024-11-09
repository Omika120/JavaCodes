package com.apj;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int a=sc.nextInt();
        int Factorial=factorial(a);
        System.out.println(Factorial);
        sc.close();
        
    }
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
}
