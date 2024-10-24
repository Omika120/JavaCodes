package com.apj;
import java.util.*;

public class EvenSum {
    public static void main(String[] args) {
        // ArrayList with given integers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 21, 32, 43, 54, 65));

        System.out.println("Given List: " + numbers);

        // Calculate the sum of even numbers
        int evenSum = calculateEvenSum(numbers);

        // Print the result
        System.out.println("Sum of even numbers: " + evenSum);
    }

    // Method to calculate the sum of even numbers
    public static int calculateEvenSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            if (num % 2 == 0) {  // Check if the number is even
                sum += num;
            }
        }
        return sum;
    }
}
