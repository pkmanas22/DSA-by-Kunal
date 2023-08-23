/*04. Set Matrix Zeroes
    Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
    You must do it in place.

Example 1:
    Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
    Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:
    Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
    Output: [[*//*0,0,0,0],[0,4,5,0],[0,3,1,0]]
    */


package Assignment._05_arrays.Medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class _04_setMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        boolean firstColHasZero = false;

        // Check whether first column needs to be set to zero
        for (int i = 0; i < numRows; i++) {
            if (matrix[i][0] == 0){
                firstColHasZero = true;
            }
            for (int j = 1; j < numCols; j++) {
                if (matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Set rows and columns to zero based on flags in first row and column
        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j < numCols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int i = 0; i < numCols; i++) {
                matrix[0][i] = 0;
            }
        }

        if (firstColHasZero){
            for (int i = 0; i < numRows; i++) {
                matrix[i][0] = 0;
            }
        }

        // Print the updated matrix
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//        Time Complexity : O(M×N)  where M and N are the number of rows and columns respectively.
//        Space Complexity : O(1)



        /*
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0){
                     row.add(i);
                     col.add(j);
                }
            }
        }
//        System.out.println(row);
//        System.out.println(col);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row.contains(i) || col.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }

        for (int [] arr:matrix) {
            System.out.print(Arrays.toString(arr));
            System.out.println();
        }

        1. The time complexity of the given algorithm is O(rc(r+c)),
        where r is the number of rows in the matrix and c is the number of columns in the matrix.
        2. the space complexity of the code is O(rc),
        where r and c are the number of rows and columns in the input matrix, respectively.
        */
    }
}
