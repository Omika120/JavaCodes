package com.apj;
import java.util.*;

public class ReverseStringList {
    public static void main(String[] args) {
        // given list of strings
        List<String> stringList = Arrays.asList("Apple", "Banana", "Cherry", "Date");

        System.out.println("Original List: " + stringList);

        // Reverse the list using Collections.reverse()
        List<String> reversedList = new ArrayList<>(stringList);  // Copy to avoid modifying original list
        Collections.reverse(reversedList);

        System.out.println("Reversed List: " + reversedList);
    }
}
