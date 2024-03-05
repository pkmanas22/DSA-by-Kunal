package _15_BS_Questions;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//34. Find First and Last Position of Element in Sorted Array

import java.lang.reflect.Array;
import java.util.Arrays;

public class _04_firstLastPosition {
    public static void main(String[] args) {
        int [] nums = {5,6,8,7,7,8,8,10};
        int target = 7;

        int [] ans = {-1,-1};

        int start = search(nums, target, true);
//        System.out.println(start);
        int end = search(nums, target, false);
//        System.out.println(end);
        ans[0] = start;
        ans[1] =  end;
        System.out.println(Arrays.toString(ans));;
    }

    public static int search(int[] nums, int target, boolean isForStart) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                ans = mid;

                if (isForStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
