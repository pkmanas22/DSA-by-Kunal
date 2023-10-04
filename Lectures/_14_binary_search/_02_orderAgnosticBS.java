package _14_binary_search;

public class _02_orderAgnosticBS {
    public static void main(String[] args) {
//        int[] nums = {2,4,5,8,10,12,15,25,36,45,46,52,57,68,70};
        int[] nums = {100,98,87,65,54,43,39,25,18,9,4};
        int target = 98;
        System.out.println(orderAgnosticBS(nums, target));
    }

    private static int orderAgnosticBS(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;

//        find weather nums[] is sorted in ascending or descending
        boolean isAsc = nums[start] < nums[end];

        while (start <= end) {
//            find middle element
//            int mid = (start + end) / 2;  // start + end may exceed if both are large number so...
            int mid = start + (end-start)/2;

            if (target == nums[mid]){
                return mid;
            }

            if (isAsc){
                if (target < nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else {
                if (target > nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
}
