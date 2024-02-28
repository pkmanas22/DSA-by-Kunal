package _05_arrays.Medium;
/*
75. Sort Colors
        Given an array nums with n objects colored red, white, or blue, sort them in-place
        so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
        We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
        You must solve this problem without using the library's sort function.

    Example 1:
        Input: nums = [2,0,2,1,1,0]
        Output: [0,0,1,1,2,2]

    Example 2:
        Input: nums = [2,0,1]
        Output: [0,1,2]
*/

import java.util.Arrays;

public class _09_Sort_Colors {
    public static void main(String[] args) {
        int[] nums = {2,0,1,2,1,0,1,1,0,1};
        sortColors(nums);
    }

    private static void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int n : nums){
            if (n == 0) zero++;
            else if (n == 1) one++;
            else two++;
        }

        Arrays.fill(nums, 0, zero, 0);
        Arrays.fill(nums, zero, zero+one, 1);
        Arrays.fill(nums, zero+one, nums.length, 2);

        /*
        for (int i = 0; i < zero; i++) {
            nums[i] = 0;
        }
        for (int i = zero; i < zero+one; i++) {
            nums[i] = 1;
        }
        for (int i = zero+one; i < nums.length; i++) {
            nums[i] = 2;
        }*/

        System.out.println(Arrays.toString(nums));
//        time complexity of O(n) and space complexity of O(1)
    }
}
