package com.apj;
import java.util.Scanner;
public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no.of elements:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter theelements:");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int EveSum=0, OddSum=0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]%2==0)
            {
                EveSum+=arr[i];
            }
            else
            {
                OddSum+=arr[i];
            }

        }
        System.out.println("Sum of odd elements: "+OddSum);
        System.out.println("Sum of even elements: "+EveSum);


        sc.close();
    }
}
