package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array<T extends Comparable<T>> {
    private T[] array;

    // Constructor to initialize the array with a given size
    public Array(int size) {
        array = (T[]) new Comparable[size];
    }

    // Method to fill the array from the keyboard
    public void fillFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements of the array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = (T) scanner.next();
        }
    }

    // Method to fill the array with random numbers
    public void fillWithRandomNumbers() {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            // Assuming T is a numeric type
            array[i] = (T) (Number) random.nextInt(100);
        }
    }

    // Method to output the array
    public void displayArray() {
        System.out.println("Array elements: " + Arrays.toString(array));
    }

    // Method to find the maximum value
    public T findMax() {
        T max = array[0];

        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }

    // Method to find the minimum value
    public T findMin() {
        T min = array[0];

        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }

        return min;
    }

    // Method to calculate the average arithmetic value
    public double calculateAverage() {
        double sum = 0;

        for (T element : array) {
            sum += ((Number) element).doubleValue();
        }

        return sum / array.length;
    }

    // Method to sort the array in ascending order
    public void sortAscending() {
        Arrays.sort(array);
    }

    // Method to sort the array in descending order
    public void sortDescending() {
        Arrays.sort(array, (a, b) -> b.compareTo(a));
    }

    // Method to search for values in the array using binary search
    public int binarySearch(T value) {
        return Arrays.binarySearch(array, value);
    }

    // Method to replace a value in the array with a new value
    public void replaceValue(T oldValue, T newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)) {
                array[i] = newValue;
                break; // Assuming you want to replace only the first occurrence
            }
        }
    }
}