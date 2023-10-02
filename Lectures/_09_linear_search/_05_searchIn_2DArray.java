package _09_linear_search;

import java.util.Arrays;

public class _05_searchIn_2DArray {
    public static void main(String[] args) {
        int[][] nums = {{2, 52, 45},
                        {56, 25, 43, 21}};
        int target = 21;

        int[] ans = searchIn2DArray(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchIn2DArray(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
