package com.apj;
import java.util.*;

public class Fabonacci {
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of terms: ");
        int n=sc.nextInt();
        int a=0,b=1;
        if(n==1){
            System.out.print("0");
        }
        else if(n==2){
            System.out.print("1");
        }
        else{
            System.out.print("0 ");
            System.out.print("1 ");

            while(n>2){
            
                int c=a+b;
                a=b;
                b=c;
                System.out.print(c +" ");
                n--;
            }
        }
        sc.close();
    }
    
}
