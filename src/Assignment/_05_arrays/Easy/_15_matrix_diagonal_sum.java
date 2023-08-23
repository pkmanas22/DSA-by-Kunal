//15. Matrix Diagonal Sum
//Given a square matrix mat, return the sum of the matrix diagonals.
//
//        Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

//Input: mat = [[1,2,3],
//        [4,5,6],
//        [7,8,9]]
//        Output: 25
//        Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//        Notice that element mat[1][1] = 5 is counted only once.

package Assignment._05_arrays.Easy;

public class _15_matrix_diagonal_sum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int ans =diagonalSum(mat);
        System.out.println(ans);
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int l = mat.length;
        for (int i = 0; i < l; i++) {
            sum += mat[i][i] + mat[i][l - i- 1];
        }
        if (l % 2 != 0){
            sum = sum - mat[l/2][l/2];
        }
        return sum;
    }
}
