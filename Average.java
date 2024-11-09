package com.apj;
import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three no.s: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int Avg=average(a,b,c);
        System.out.println("Average: "+Avg);
        sc.close();
    }

    public static int average(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }
}
