package Lectures._05_arrays;

import java.util.Arrays;

public class _03_reverse_array {
    public static void main(String[] args) {
        int[] arr = {1,5,2,6,23,12};
        System.out.println(Arrays.toString(reverseArr(arr)));
        System.out.println(Arrays.toString(swap(arr)));
    }

    private static int[] reverseArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length -i - 1];
        }
        return newArr;
    }

//    (or) by swapping start and end points
    static int[]  swap(int[] arr){
        int start  = 0;
        int end = arr.length - 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start += 1;
            end -= 1;
        }
        return arr;
    }
}
