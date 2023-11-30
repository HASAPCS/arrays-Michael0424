package com.example;
import java.util.Arrays;   

public class ArrayOperations {

    public static void main(String[] args) {
        int[] Array = { 3, 5, 9, 1, 10 };
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);

        }

        // Exercise 1: Initialize and Print an Array
        // TODO: Initialize an array of integers and print its contents.
    }

    // Exercise 2: Find the Maximum Value in an Array
    public static int findMaximumValue(int[] array) {
        int max = array[0];
        for (int number:array){
            if (number> max){
                max=number;
            }
        }
        return max;
        // TODO: Implement the logic to find the maximum value in the array.
         // Placeholder return value
    }

    // Exercise 3: Check for a Specific Value
    public static boolean containsValue(int[] array, int value) {
        for (int number : array) {
            if (number == value) {
                return true;
            }
        }

        // TODO: Implement the logic to check if the array contains the specified value.
        return false; // Placeholder return value
    }

    // Exercise 4: Calculate the Average of Array Elements
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }

        // TODO: Implement the logic to calculate the average of the array elements.
        return (double) sum / array.length; // Placeholder return value
    }

    // Exercise 5: Reverse an Array
    public static int[] reverseArray(int[] array) {

        int[] reversedArray = new int[array.length];
        // TODO: Implement the logic to reverse the array.
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        return reversedArray;// Placeholder return value
    }

    // Exercise 6: Sort an Array
    public static void sortArray(int[] array) {
        Arrays.sort(array);

        // TODO: Implement a sorting algorithm to sort the array.
    }
}
