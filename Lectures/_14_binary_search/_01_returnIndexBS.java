package _14_binary_search;

public class _01_returnIndexBS {
    public static void main(String[] args) {
        int[] nums = {2,4,5,8,10,12,15,25,36,45,46,52,57,68,70};
        int target = 9;
        System.out.println(searchInArray(nums, target));
    }

//    return the index
//    return -1 if not found
    static int searchInArray(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;

        while (start <= end) {
//            find middle element
//            int mid = (start + end) / 2;  // start + end may exceed if both are large number so...
            int mid = start + (end-start)/2;

            if (target < nums[mid]){
                end = mid - 1;
            }else if (target > nums[mid]){
                start = mid + 1;
            }else
                return  mid; // answer find
        }
        return -1;
    }
}
