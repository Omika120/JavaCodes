package com.apj;
import java.util.*;

public class StringS {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a="Omika";
        String e="Omika";
        System.out.println("Enter the surname: ");
        String b= sc.nextLine();

        //FUNCTIONS
        //1. concatenation

        String c= a+" "+b;
        System.out.println(c);

        //2.Lenght
        System.out.println("length of "+b+" is "+ b.length());

        //charAt
        for(int i=0;i<c.length();i++){
            System.out.println(c.charAt(i));
        }

        //compareTo
        if(a.compareTo(e)==0){
            System.out.println("Equal a and e");
        }

        //substring
        System.out.println(c);
        System.out.println(c.substring(6));


        sc.close();
    }
}
