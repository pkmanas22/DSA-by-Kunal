package _06_searching.easy;
//https://leetcode.com/problems/kth-missing-positive-number/description/
//1539. Kth Missing Positive Number

import java.util.ArrayList;
import java.util.Arrays;

public class _08_Kth_missingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9};
        int k = 5;
        System.out.println(findKthPositive(arr , k));
    }

//    Binary search         O(log N)
    public static int findKthPositive (int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return start + k;
    }

//    Brute-force method        o(N)
    /*public static int findKthPositive (int[] arr, int k) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= k) k++;
            else break;
        }
        return k;
    }*/
}
