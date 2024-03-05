package _15_BS_Questions;

public class _02_floorOfNumber {
    public static void main(String[] args) {
        int [] arr = {2, 4, 5, 9, 14, 16, 18};
        int target = 1;
        int ans = floorNumber(arr, target);
        System.out.println(ans);
    }

    static int floorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return arr[mid];
            }
            if (target > arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return end;
    }
}
