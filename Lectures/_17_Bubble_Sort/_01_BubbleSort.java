package _17_Bubble_Sort;

import java.util.Arrays;

public class _01_BubbleSort {
    public static void main(String[] args) {
        int [] arr = {-6,-0,-5,4545,-56565};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Method to perform bubble sort on an array
    static void bubbleSort(int[] arr){
        // Flag to indicate whether any swap occurred during a pass
        boolean isSwapped;

        // Loop through the array    -->  run the steps n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            isSwapped = false;

            //  for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = true; // Set flag to true indicating a swap occurred
                }
            }

            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!isSwapped)
                break;
        }
    }
}
