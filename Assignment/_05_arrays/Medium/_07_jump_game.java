/*
55. Jump Game

        You are given an integer array nums. You are initially positioned at the array's first index,
        and each element in the array represents your maximum jump length at that position.

        Return true if you can reach the last index, or false otherwise.
        */

package Assignment._05_arrays.Medium;

public class _07_jump_game {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0};
        System.out.println(canJump(arr));
    }

    public static boolean canJump(int[] nums) {
        int step = 0;
        boolean flag = false;
        for (int i = step; i < nums.length; i++) {
            if (nums[i] == 0){
                flag = false;
                break;
            }
            if (nums[i] < nums.length-1){
                step += nums[i];
            }else {
                flag = true;
                break;
            }
        }
        if (nums[nums.length-1] == 0 || nums.length==1){
            flag = true;
        }
        return flag;
    }
}
