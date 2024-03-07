package _15_BS_Questions;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
//33. Search in Rotated Sorted Array

public class _08_searchInRotatedSortedArr {
    public static void main(String[] args) {
        int [] nums = {1};
        int target = 0;
        int ans = search(nums, target);
        System.out.println(ans);
    }
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int ans;
//        normal BS
        if (pivot == -1){
            return doBinarySearch(0,nums.length-1,nums, target);
        }
        if (target == nums[pivot]){
            return pivot;
        }
        ans = doBinarySearch(0,pivot-1,nums, target);
        if (ans == -1){
            return doBinarySearch(pivot+1,nums.length-1,nums, target);
        }
        return ans;
    }

    private static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        while (start <= end ){
            int mid =  start + (end - start) / 2;
            // all four cases
            if (mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if (nums[mid] <= nums[start]){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }

    public  static  int doBinarySearch(int start, int end, int[] arr, int target){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            }
            if (target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
