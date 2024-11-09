package com.apj;
import java.util.*;

public class TdArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int i= sc.nextInt();
        System.out.println("Enter the no. of columns: ");
        int j= sc.nextInt();
        System.out.println("Enter the element you want to search: ");
        int a= sc.nextInt();
        int[][] b= new int[i][j];

        System.out.println("Enter the elements: ");
        for(int x=0;x<i;x++){
            for(int y=0;y<j;y++){
                b[x][y]=sc.nextInt();
            }
        }

        System.out.println("YOUR INPUT:");
        for(int x=0;x<i;x++){
            for(int y=0;y<j;y++){
                System.out.print(b[x][y]+" ");
            }
            System.out.println();
        }
        Search(a,i,j,b);
        sc.close();

        
    }

    public static void Search(int a,int i, int j, int b[][]){
        int n=0;
        for(int x=0;x<i;x++){
            for(int y=0;y<j;y++){
                if(b[x][y]==a){
                    System.out.println("Element found at index: ("+x+","+y+")" );
                    n=1;
                }
            }
        }
        if(n==0){
            System.out.println("Element not found");
        }

    }
    
}
