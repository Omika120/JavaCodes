package com.apj;
import java.util.*;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no.:");
        int first=sc.nextInt();
        int second=sc.nextInt();
        int Sum=Sum(first,second);
        System.out.println(Sum);
        sc.close();
    }
    public static int Sum(int a,int b){
        int c=a+b;
        return c;
    }
}
