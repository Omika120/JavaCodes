package com.apj;
import java.util.*;

public class NumCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int pos=0,neg=0,zero=0;
        String choice;
        do{
            System.out.println("enter a no.:");
            int a=sc.nextInt();

            if(a>0){
                pos++;
            }
            else if(a<0){
                neg++;
            }
            else{
                zero++;
            }

            sc.nextLine();
            
            System.out.println("Enter 'stop' to end input. or press Enter to continue:");
            choice= sc.nextLine();

        }while(!choice.equalsIgnoreCase("stop"));


        System.out.println("Postive numbers: " +pos);
        System.out.println("Negative numbers: " +neg);
        System.out.println("Zeroes: " +zero);

        sc.close();

    }
}
