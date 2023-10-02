package _09_linear_search;

public class _03_searchIn_range {
    public static void main(String[] args) {
        int[] nums = {2,52,45,56,25,43,21};
        int target = 43;
        int start = 1;
        int end = 5;
        System.out.println(searchInRange(nums, target, start, end));
    }

    static int searchInRange(int[] arr, int target, int start, int end){
        for (int i = start; i <= end; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
