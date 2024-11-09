package com.apj;

import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class TreeMap2 {
    public static void main(String[] args) {
        // Initialize TreeMap with some key-value pairs
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        System.out.println("Initial TreeMap: " + treeMap);

        // 1. Using forEach method (Java 8 and above)
        System.out.println("\nUsing forEach:");
        treeMap.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        // 2. Using entrySet() with enhanced for loop
        System.out.println("\nUsing entrySet() with for loop:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 3. Using keySet() to iterate over keys only
        System.out.println("\nUsing keySet() to iterate over keys:");
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

        // 4. Using values() to iterate over values only
        System.out.println("\nUsing values() to iterate over values:");
        for (Integer value : treeMap.values()) {
            System.out.println("Value: " + value);
        }

        // 5. Using Iterator on entrySet()
        System.out.println("\nUsing Iterator on entrySet():");
        Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 6. Using descendingMap() to iterate in reverse order
        System.out.println("\nUsing descendingMap() to iterate in reverse order:");
        for (Map.Entry<String, Integer> entry : treeMap.descendingMap().entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 7. Using stream() (Java 8 and above)
        System.out.println("\nUsing stream:");
        treeMap.entrySet().stream().forEach(entry -> {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        });
    }
}
