package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Course: Java programming language
        //Topic: Object-oriented programming.
        //Part three
        //Task 1:
        //Create a template class Array, which is an array that allows you to store objects
        //of a given type. It is necessary to implement:
        // filling the array from the keyboard
        // filling the array with random numbers
        // array output
        // finding the maximum value
        // finding the minimum value
        // calculating the average arithmetic value
        // array sorting by growth
        // array sorting in descending order
        // searching for values in an array using binary search
        // replacing the value in the array with a new value
        // Create an instance of Array for Integer
        Array<Integer> integerArray = new Array<>(5);

        // Fill the array with random numbers
        integerArray.fillWithRandomNumbers();
        integerArray.displayArray();

        // Find the maximum and minimum values
        System.out.println("Max value: " + integerArray.findMax());
        System.out.println("Min value: " + integerArray.findMin());

        // Calculate the average
        System.out.println("Average: " + integerArray.calculateAverage());

        // Sort the array in ascending order
        integerArray.sortAscending();
        integerArray.displayArray();

        // Sort the array in descending order
        integerArray.sortDescending();
        integerArray.displayArray();

        // Search for a value using binary search
        int searchValue = 42;
        int searchResult = integerArray.binarySearch(searchValue);
        System.out.println("Index of " + searchValue + ": " + searchResult);

        // Replace a value in the array
        int oldValue = 42;
        int newValue = 99;
        integerArray.replaceValue(oldValue, newValue);
        integerArray.displayArray();
    }
}