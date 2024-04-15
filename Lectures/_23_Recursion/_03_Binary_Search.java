package _23_Recursion;

public class _03_Binary_Search {
    public static void main(String[] args) {
        int [] arr = { 1,3,5,7,10,25,34,45};
        int target = 10;
        int index = searchIndexBS(arr, target, 0, arr.length-1);
        System.out.println(index);
    }

    private static int searchIndexBS(int[] arr, int target, int start, int end) {
        if (start > end) return  -1;

        int mid = start + (end - start) / 2;

        if (target == arr[mid]) return mid;

        if (target < arr[mid]){
            return  searchIndexBS(arr, target, start, mid-1);
        }
        return searchIndexBS(arr,target,mid+1, end);

    }
}
