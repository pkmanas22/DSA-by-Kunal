package _15_BS_Questions;

public class _01_CeilingOfNumber {
    public static void main(String[] args) {
        int [] arr = {2, 4, 5, 9, 14, 16, 18};
        int target = 19;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target > arr[end]){
                return -1;
            }
            if (target == arr[mid]){
                return arr[mid];
            }
            if (target > arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return start;
    }
}
