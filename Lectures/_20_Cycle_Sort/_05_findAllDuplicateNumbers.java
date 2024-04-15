package _20_Cycle_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
//442. Find All Duplicates in an Array
public class _05_findAllDuplicateNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates2(nums));
    }

//    optimal
    public static List<Integer> findDuplicates2(int[] nums) {
        int[] count = new int[nums.length + 1];
        for (int num: nums){
            count[num]++;
        }
//        System.out.println(Arrays.toString(count));
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for (int i = 0; i < count.length; i++){
            if (count[i]>=2){
                ans.add(i);
            }
        }
        return ans;
    }

//    cycle sort
    public static List<Integer> findDuplicates(int[] nums) {
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
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }

    private static void swapNo(int[] arr, int source, int dest) {
        int temp = arr[source];
        arr[source] = arr[dest];
        arr[dest] = temp;
    }
}
