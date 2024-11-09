package com.apj;

import java.util.*;

public class AppendToHashSet {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> fruits = new HashSet<>();

        // Add initial elements
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");

        // Display the HashSet before adding the new element
        System.out.println("Before appending: " + fruits);

        // Append the specified element to the HashSet
        fruits.add("Date");

        // Display the HashSet after adding the new element
        System.out.println("After appending: " + fruits);
    }
}

