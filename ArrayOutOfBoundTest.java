package com.apj;

public class ArrayOutOfBoundTest {
    public static void main(String[] args) {
        //initialising the array
        int[] arr={1,2,3,4,5};

        try{
            //using loop greater than length of our array.
            for(int i=0;i<=arr.length;i++){
                System.out.println("Element at index "+i+ " is "+arr[i]);
            }  
        }
        //catch the exception 
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: "+e);
        }
    }
}
