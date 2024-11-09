package com.apj;

//0-1 triangle
public class Pattern9 {
    public static void main(String[] args) {
        int a=1;

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+ " ");
                if(a==1){
                    a=0;
                }
                else{
                    a=1;
                }
            }
            System.out.println();
        }
    }
}
