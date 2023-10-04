package _12_arrays;

public class _02_maximum_value_array {
    public static void main(String[] args) {
        int[] arr = {1,5,2,6,23,12};

        System.out.println(maxValue(arr));
        System.out.println(maxInRange(arr, 0,3));
    }

    private static int maxInRange(int[] arr, int start, int end) {
        if (end > start) {
            return -1;
        }
        if (arr.length == 0) {
            return -1;
        }

        int max = arr[0];
        for (int i = start; i <= end ; i++) {
            if (arr[i] >= max){
                max = arr[i];
            }
        }
        return max;
    }

    private static int maxValue(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for(int n : arr){
            if (n >= max){
                max = n;
            }
        }
        return  max;
    }
}
