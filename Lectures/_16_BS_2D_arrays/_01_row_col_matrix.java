package _16_BS_2D_arrays;

import java.util.Arrays;

public class _01_row_col_matrix {
    public static void main(String[] args) {
        int[][] matrix = { { 10,20,30,40 },
                           { 15,25,35,45 },
                           { 28,38,48,58 },
                           { 32,42,52,62 } };
        int target = 48;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] search (int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;

        while (row < matrix.length && col >= 0){
            if (matrix[row][col] == target){
                return new int[] {row,col};
            }
            if (matrix[row][col] > target){
                col--;
            }
            if (matrix[row][col] < target){
                row++;
            }
        }
        return new int[] {-1,-1};
    }
}
