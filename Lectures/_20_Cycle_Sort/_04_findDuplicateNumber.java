package _20_Cycle_Sort;

import java.util.Arrays;

//https://leetcode.com/problems/find-the-duplicate-number/description/
//287. Find the Duplicate Number
public class _04_findDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
//    optimal
    public static int findDuplicate2(int[] nums) {
        boolean [] isExists = new boolean[nums.length];
        for(int num : nums){
            if(isExists[num]) return num;
            else isExists[num] = true;
        }
        return 0;
    }
//    cyclic sort
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swapNo(nums, i, correctIndex);
            }else {
                i++;
            }
        }
//        System.out.println(Arrays.toString(nums));
        return nums[nums.length-1];
    }

    private static void swapNo(int[] arr, int source, int dest) {
        int temp = arr[source];
        arr[source] = arr[dest];
        arr[dest] = temp;
    }
}
