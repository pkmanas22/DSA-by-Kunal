package _18_Selection_Sort;

import java.util.Arrays;

public class _01_SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Function to implement selection sort
    private static void selectionSort(int[] arr) {
        // Iterating through the array
        for (int i = 0; i < arr.length; i++) {
            // Finding the index of the maximum element in the unsorted portion of the array
            int last = arr.length - 1 - i;
            int maxIndex = findMaxIndex(arr, last);

            // Swapping the maximum element with the last unsorted element
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    // Function to find the index of the maximum element in a given range
    private static int findMaxIndex(int[] arr, int last) {
        int max = 0;
        // Iterating through the range and updating the index of the maximum element
        for (int i = 1; i <= last; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
