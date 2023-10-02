package _09_linear_search;

public class _06_maximumIn_2DArray {
    public static void main(String[] args) {
        int[][] nums = {{2, 52, 453},
                {56, 25, 43, 21}};
        System.out.println(searchIn2DArray(nums));
    }

    static int searchIn2DArray(int[][] arr){
//        int max = arr[0][0];
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
