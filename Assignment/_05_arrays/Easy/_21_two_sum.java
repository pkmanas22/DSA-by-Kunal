//21. Two Sum
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.


//Example 1:

//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


package Assignment._05_arrays.Easy;

public class _21_two_sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 13;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == target - nums[j])
                    System.out.println(i + " " + j);
            }
        }
    }
}
