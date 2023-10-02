package _09_linear_search;

public class _04_find_minimumNumber {
    public static void main(String[] args) {
        int[] nums = {2,52,45,56,25,-1,21};
        System.out.println(findMin(nums));
    }

    static int findMin(int[] arr){
        int min = arr[0];
        for (int each: arr){
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
}
