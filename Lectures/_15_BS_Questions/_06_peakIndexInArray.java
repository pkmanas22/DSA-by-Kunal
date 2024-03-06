package _15_BS_Questions;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//852. Peak Index in a Mountain Array.
//same question
//https://leetcode.com/problems/find-peak-element/description/
//162. Find Peak Element

public class _06_peakIndexInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,7,6,3,2};
        int result = peakIndexInMountainArray(arr);
        System.out.println(result);
    }

//    Kunal's approach
public static int peakIndexInMountainArray(int[] arr) {
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

//    by me
    public static int peakIndexInMountainArray2(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        if (arr.length >= 3){
            while (start <= end){
                int mid = start + (end - start) / 2;
                if (arr[mid] > arr[mid+1]){
                    if (arr[mid] > arr[mid-1]){
                        return  mid;
                    }else {
                        end = mid - 1 ;
                    }
                }else {
                    start = mid + 1;
                }
            }
        }

        return  -1;
    }
}
