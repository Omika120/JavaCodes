package com.apj;
import java.util.*;

public class TreeMap1 {
    public static void main(String[] args) {
        // Initializing TreeMap with given key-value pairs
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        // Print the initial TreeMap
        System.out.println("Initial TreeMap: " + treeMap);

        // Remove the entry for the specified key ("Two") and return its value
        Integer removedValue = treeMap.remove("Two");
        System.out.println("Removed value = " + removedValue);

        // Check if "Three" is still present
        boolean isThreeRemoved = !treeMap.containsKey("Three");
        System.out.println("Is the entry {Three=3} removed? " + isThreeRemoved);

        // Remove "Three" explicitly
        treeMap.remove("Three");

        // Display the updated TreeMap
        System.out.println("Updated TreeMap: " + treeMap);
    }
}
