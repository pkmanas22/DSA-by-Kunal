package _05_arrays.Medium;
/*
189. Rotate Array
        Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

        Example 1:

        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/

import java.util.ArrayList;
import java.util.Arrays;

public class _08_rotate_array {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;

        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

        System.out.println(Arrays.toString(nums));

//        anotherApproach(nums, k);
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

//        Time Complexity: O(n)
//        Space Complexity: O(1)
    }

    private static void anotherApproach(int[] nums, int k) {
        k = k % nums.length; //for k greater than nums.length
        ArrayList<Integer> newarr = new ArrayList<>();

        for(int i = nums.length-k; i < nums.length; i++){
            newarr.add(nums[i]);
        }

        for(int j = 0; j < nums.length-k; j++){
            newarr.add(nums[j]);
        }

        for (int i = 0; i < nums.length; i++) {     // for leetcode
            nums[i] = newarr.get(i);
        }


        System.out.println(Arrays.toString(nums));
//        Time Complexity: O(n)
//        Space Complexity: O(n)
    }

}
