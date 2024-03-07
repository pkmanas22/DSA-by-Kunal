package _15_BS_Questions;

public class _09_searchInRotatedSortedArrDuplicateValues {
    public static void main(String[] args) {
        int [] nums = {2,2,9,9,9,0,0,1,1,2};
        int target = 2;
        int ans = search(nums, target);
        System.out.println(ans);
    }
    public static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        System.out.println("pivot = " + pivot);
        int ans;
//        normal BS
        if (pivot == -1){
            return doBinarySearch(0,nums.length-1,nums, target);
        }
        if (target == nums[pivot]){
            return pivot;
        }
        ans = doBinarySearch(0,pivot-1,nums, target);
        if (ans == -1){
            return doBinarySearch(pivot+1,nums.length-1,nums, target);
        }
        return ans;
    }

    private static int findPivotWithDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        while (start <= end ){
            int mid =  start + (end - start) / 2;
            // all four cases
            if (mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            // if elements at  mid, start, end are equal, then just skip the duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]){
                // skip the duplicates
                // check whether the  elements at start or end can be pivoted
                if (nums[start] > nums[start+1]){
                    return start;
                }
                start++;
                if (nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            }else if (nums[start] < nums[end] || nums[start] == nums[mid] && nums[mid] > nums[end]){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }

        return -1;
    }

    public  static  int doBinarySearch(int start, int end, int[] arr, int target){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            }
            if (target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
