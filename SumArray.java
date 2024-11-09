package com.apj;
import java.util.Scanner;
public class SumArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]={1,2,3,4,5};
        int sum=0;
        for(int i=0; i<a.length; i++)
        {
            sum+=a[i];

        }
        System.out.println("Sum of array is: "+sum);
        sc.close();
    }
}
