//14. Cells with Odd Values in a Matrix
//There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.
//
//        For each location indices[i], do both of the following:
//
//        Increment all the cells on row ri.
//        Increment all the cells on column ci.
//        Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

//Input: m = 2, n = 3, indices = [[0,1],[1,1]]
//        Output: 6
//        Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//        After applying first increment it becomes [[1,2,1],[0,1,0]].
//        The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.

        package Assignment._05_arrays.Easy;

public class _14_cell_odd_values {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int [][] indices = {{0,1},{1,1}};
        int [][] matrix = new int [m][n];
        int count = 0;
        for (int [] arr: indices) {
            int row = arr[0];
            int col = arr[1];
//            System.out.println(row);
//            System.out.println(col);
            for (int r = 0; r < n; r++) {
                matrix[row][r]+= 1;
//                System.out.print(matrix[row][r]);
            }
//            System.out.println();
            for (int c = 0; c < m; c++) {
                matrix[c][col]+=1;
//                System.out.print(matrix[row][c]);
            }
//            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j]);
                if( matrix[i][j] % 2 != 0){
                    count++;
                }
            }
//            System.out.println();
        }
        System.out.println(count);
    }
}
