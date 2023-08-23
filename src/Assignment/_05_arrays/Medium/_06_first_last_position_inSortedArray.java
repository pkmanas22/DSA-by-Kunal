/*
06. Find First and Last Position of Element in Sorted Array

    Given an array of integers nums sorted in non-decreasing order,
    find the starting and ending position of a given target value.

    If target is not found in the array, return [-1, -1].

    You must write an algorithm with O(log n) runtime complexity.

Example 1:
    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]

Example 2:
    Input: nums = [5,7,7,8,8,10], target = 6
    Output: [-1,-1]

Example 3:
    Input: nums = [], target = 0
    Output: [-1,-1]
*/

package Assignment._05_arrays.Medium;

import java.util.Arrays;

public class _06_first_last_position_inSortedArray {
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 6;
        int firstIndex = -1;
        int lastIndex = -1;
        int [] answer = new int[2];

//        first index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                firstIndex = i;
                break;
            }
        }

//        last index
        for (int j = nums.length-1; j >= 0; j--) {
            if (nums[j] == target) {
                lastIndex = j;
                break;
            }
        }

        answer[0] = firstIndex;
        answer[1] = lastIndex;

        System.out.println(Arrays.toString(answer));
//        the total time complexity of the code is O(n) + O(n) = O(n).
//        the space complexity of the code is O(1).
    }
}
