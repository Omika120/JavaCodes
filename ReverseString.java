package com.apj;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder a= new StringBuilder("ADITYA");

        int c=a.length();

        for(int i=0;i<(c/2);i++){
            int front=i;
            int back= c-1-i;

            char Front=a.charAt(front);
            char Back= a.charAt(back);
            
            a.setCharAt(front,Back);
            a.setCharAt(back,Front);

        }

        System.out.println(a);
        sc.close();
    }
}
