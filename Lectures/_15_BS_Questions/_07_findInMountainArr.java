package _15_BS_Questions;
//https://leetcode.com/problems/find-in-mountain-array/description/
//1095. Find in Mountain Array

public class _07_findInMountainArr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,7,6,3,2};
        int target = 3;
        int result = findInMountainArray(target, arr);
        System.out.println(result);
    }

    private static int findInMountainArray(int target, int[] arr) {
       int leftSideIndex = binarySearch(0, peakNumber(arr), target, arr, true);
       if (leftSideIndex == -1){
           return binarySearch( peakNumber(arr), arr.length-1, target, arr, false);
       }
       return leftSideIndex;
    }

    public  static  int binarySearch(int start, int end, int target, int[] arr, boolean isLeft){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            }
            if (isLeft){
                if (target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int peakNumber(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}
