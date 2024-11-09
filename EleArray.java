package com.apj;
import java.util.Scanner;
public class EleArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements: ");
        n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("You entered the following elements:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element " + (i + 1) + ": " + arr[i]);
        }

        sc.close();
    }
    
}
