//24. Maximum Subarray
//
//    Given an integer array nums, find the
//    subarray
//    with the largest sum, and return its sum.
//
//Example 1:
//
//    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//    Output: 6
//    Explanation: The subarray [4,-1,2,1] has the largest sum 6.

package Assignment._05_arrays.Easy;

public class _24_maximum_subarray{
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};

        // Kadane's Algorithm
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            sum = Math.max(num, (sum + num));
//            sum += nums[i];
//            if (sum < 0){
//                sum = 0;
//            }
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println(maxSum);

        // Brute Force Approach
        /*
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {         // Starting element
            for (int j = i; j < nums.length; j++) {     // Ending element
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k]);
                    sum += nums[k];
                    maxSum = Math.max(maxSum,sum);
                }
                System.out.println("\nSum = " + sum);
                System.out.println();
            }
        }
        System.out.println("maxSum = " + maxSum);

         */
    }
}
