package com.apj;

import java.util.*;

public class Collection {

    public static void main(String[] args) {
    

    ArrayList<Integer> a= new ArrayList<>();

    a.add(100);
    a.add(90);
    a.add(80);
    a.add(70);
    a.add(60);

    System.out.println("Original List" +a);

    Collections.swap(a, 0, 4);
    System.out.println("List after swapping=" +a);

    Collections.swap(a, 0, 4);

    Collections.reverse(a);
    System.out.println("List after reversal=" +a);

    Collections.sort(a);
    System.out.println("List after sorting=" +a);


    }

    
}
