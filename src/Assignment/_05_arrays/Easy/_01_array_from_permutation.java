//1. Build Array from Permutation
//  Given a zero-based permutation nums (0-indexed),
//        build an array ans of the same length where ans[i] = nums[nums[i]]
//        for each 0 <= i < nums.length and return it.
//
//  A zero-based permutation nums is an array of distinct integers
//        from 0 to nums.length - 1 (inclusive).
/*Input: nums = [0,2,1,5,3,4]
        Output: [0,1,2,4,5,3]
Input: nums = [0,2,1,5,3,4]
        Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows:
    ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]

 */


package Assignment._05_arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class _01_array_from_permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int N =sc.nextInt();
        int [] nums = new int[N];

        System.out.println("Enter the array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(nums));
        replace (nums);
    }

    static void replace(int[] nums) {
        int[] ans = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            ans[j] = nums[nums[j]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
