package _20_Cycle_Sort;
//https://leetcode.com/problems/missing-number/description/
//268. Missing Number
public class _02_missingNumber {
    public static void main(String[] args) {
        int [] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
//    optimized code
    public static int missingNumber2(int[] nums) {
        int arrSum = 0;
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            arrSum += nums[i];
        }
        return totalSum - arrSum;
    }

//    cycle sort
    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] == nums.length){
                i++;
                continue;
            }
            if(nums[i] != i){
                swap(nums, i,nums[i]);
            }else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(j != nums[j]){
                return j;
            }
        }
        return nums.length;
    }
    private static void swap(int[] arr, int source, int dest) {
        int temp = arr[source];
        arr[source] = arr[dest];
        arr[dest] = temp;
    }
}
