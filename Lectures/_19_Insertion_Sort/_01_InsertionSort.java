package _19_Insertion_Sort;

import java.util.Arrays;

public class _01_InsertionSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        int temp;
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
