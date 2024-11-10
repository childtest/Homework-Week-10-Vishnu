package homework;

/* Write a Java program to reverse an array of integer values.*/

import java.util.Arrays;

public class Program_3_ArrayReverse {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};  // Example array

        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Reverse the array
        reverseArray(numbers);

        System.out.println("Reversed Array: " + Arrays.toString(numbers));

    }

    private static void reverseArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

    }
}
