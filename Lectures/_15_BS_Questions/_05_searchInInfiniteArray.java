package _15_BS_Questions;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
//Find position of an element in a sorted array of infinite numbers
public class _05_searchInInfiniteArray {
    public static void main(String[] args) {
        int [] arr = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 170;
        int ans = result(arr,target);
        System.out.println(ans);
    }

    static int result(int[] arr, int target) {
        int start = 0;
        int end = 0;
        while (target > arr[end]){
           int newStart = end + 1;
           int newEnd = end + (end - start + 1) * 2;
           end = Math.min(newEnd, arr.length-1);
           start = newStart;
            if (target > arr[arr.length-1]){
                return -1;
            }
        }

        return doBinarySearch(arr, target, start, end);
    }

    private static int doBinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            }
            if (target < arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
