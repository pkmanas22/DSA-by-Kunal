package _09_linear_search;

import java.util.Arrays;

public class _01_search_in_array {
    public static void main(String[] args) {
        int[] nums = {2,52,45,56,25,43,21};
        int target = 25;
        System.out.println(searchInArray(nums, target));
    }

//    search in the array: return the index if found ; otherwise return -1
    static int searchInArray(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
