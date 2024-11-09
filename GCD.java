package com.apj;
import java.util.*;

public class GCD {
    public static int GreatestDivisor(int x, int y){
        int max=Math.max(x,y);
        int min=Math.min(x,y);
         while (min!=0) {
            int temp=min;
            min=max%min;
            max=temp;
         }

         return max;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two no.s:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int gcd= GreatestDivisor(a,b);
        System.out.println("GCD of "+a+" and "+b+" is : "+gcd);
        sc.close();
    }
}
