package com.apj;
import java.util.*;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] arr= new int[10];

        System.out.println("Enter array elements: ");

        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<10;i++){
            
            
            if(arr[i]>=max){
                max=arr[i];
            }
            if(arr[i]<=min){
                min=arr[i];
            }
        }

        System.err.println("MAX: "+ max);
        System.out.println("MIN: "+min);

        sc.close();
    }
}
