package com.apj;

import java.util.HashMap;

public class CheckHashMapEmpty {
    public static void main(String[] args) {
        // Create an empty HashMap
        HashMap<String, String> map = new HashMap<>();

        // Check if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }

        // Add some key-value pairs to the HashMap
        map.put("name", "Omika");
        map.put("branch", "CSE");

        // Check again if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }
    }
}

