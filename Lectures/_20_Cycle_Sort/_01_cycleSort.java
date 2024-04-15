package _20_Cycle_Sort;

import java.util.Arrays;

public class _01_cycleSort {
    public static void main(String[] args) {
        int [] arr = {3,5,2,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                swapNo(arr, i, correctIndex);
            }else {
                i++;
            }
        }
    }

    private static void swapNo(int[] arr, int source, int dest) {
        int temp = arr[source];
        arr[source] = arr[dest];
        arr[dest] = temp;
    }
}
