//3. Running Sum of 1d Array
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].



package Assignment._05_arrays.Easy;

import java.util.Arrays;

public class _03_runningSum_1D_array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] runningsum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            runningsum[i] = sum;
        }
        System.out.println(Arrays.toString(runningsum));
    }
}
