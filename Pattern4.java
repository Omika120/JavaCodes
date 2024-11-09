package com.apj;

//inverted half pyramid
public class Pattern4 {
    public static void main(String[] args) {
        int m=5;
        for(int i=m;i>=1;i--)
        {
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
