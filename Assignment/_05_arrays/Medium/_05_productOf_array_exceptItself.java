/*05. Product of Array Except Self
    Given an integer array nums, return an array answer such that answer[i] is equal to the product of
    all the elements of nums except nums[i].
    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
    Input: nums = [1,2,3,4]
    Output: [24,12,8,6]

Example 2:
    Input: nums = [-1,1,0,-3,3]
    Output: [0,0,9,0,0]
    */


package Assignment._05_arrays.Medium;

import java.util.Arrays;

public class _05_productOf_array_exceptItself {
    public static void main(String[] args) {
        int [] nums = {-1,1,0,-3,3};
        int n = nums.length;
        int [] answer = new int[n];

//        for (int i = 0; i < n; i++) {
//            answer[i] = 1;
//        }
        Arrays.fill(answer, 1);
//        System.out.println(Arrays.toString(answer));

        int left = 1;
        for (int i = 1; i < n; i++) {
            left *= nums[i-1];
            answer[i] = left;
        }
//        System.out.println(Arrays.toString(answer));

        int right = 1;
        for (int i = n-1-1; i >= 0 ; i--) {
            right *= nums[i+1];
            answer[i] *= right;
        }
        System.out.println(Arrays.toString(answer));
//        the total time complexity of the code is O(n) + O(n) + O(n) = O(n).
//        space complexity of the code is O(n)



/*        for (int i = 0; i < m; i++) {
            answer[i] = 1;
            for (int j = 0; j < m; j++) {
                if (i != j) {
                    answer[i] *= nums[j];
                }
            }
            System.out.println(answer[i]);
        }
//        time complexity of the program is O(n^2) and the space complexity is O(n).*/
    }
}
