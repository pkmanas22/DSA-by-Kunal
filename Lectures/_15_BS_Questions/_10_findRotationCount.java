package _15_BS_Questions;
//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
//Find the Rotation Count in Rotated Sorted array

public class _10_findRotationCount {
    public static void main(String[] args) {
        int[] arr = { 15, 18, 22, 23, 26, 2 };
        int pivot = findPivot(arr);
        int rotationCount = pivot + 1;
        System.out.println(rotationCount);
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end-start) / 2;
            // consider checking four cases
            // case-1
            if (mid < end && arr[mid] > arr[mid+1]) return mid;
            // case-2
            if (mid > start && arr[mid] < arr[mid-1]) return mid-1;
            // case-3
            if (arr[mid] >= arr[start]){
                start = mid+1;
            }
            // case-4
            else{
                end = mid-1;
            }
        }
        return  -1;
    }
}
