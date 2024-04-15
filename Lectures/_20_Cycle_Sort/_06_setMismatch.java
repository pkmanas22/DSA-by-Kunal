package _20_Cycle_Sort;

import java.util.Arrays;
//https://leetcode.com/problems/set-mismatch/description/
//645. Set Mismatch
public class _06_setMismatch {
    public static void main(String[] args) {
        int[] nums = {2,2};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
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
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1){
                return new int[] {nums[j], j+1};
            }
        }
        return new int[] {-1,-1};
    }
    private static void swapNo(int[] arr, int source, int dest) {
        int temp = arr[source];
        arr[source] = arr[dest];
        arr[dest] = temp;
    }
}
