//01. Spiral Matrix
//    Given an m x n matrix, return all elements of the matrix in spiral order.
//
//Example 1:
//    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//    Output: [1,2,3,6,9,8,7,4,5]
//
//Example 2:
//    Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//    Output: [1,2,3,4,8,12,11,10,9,5,6,7]


package Assignment._05_arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class _01_spiral_Matrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int lr = 0;
        int hr = m-1;
        int lc = 0;
        int hc = n-1;
        ArrayList<Integer> res = new ArrayList<>(m*n);

        while (lr<=hr && lc<=hc) {
//            Top & towards right
            for (int i = lc; i <= hc; i++) {
//                System.out.println(matrix[lr][i]);
                res.add(matrix[lr][i]);
            }

//            Right side & Towards bottom
            lr++;
            for (int j = lr; j <= hr; j++) {
//                System.out.println(matrix[j][hc]);
                res.add(matrix[j][hc]);
            }
            hc--;

//            Buttom & towards left
            if(hr>= lr) {
                for (int k = hc; k >= lc; k--) {
//                    System.out.println(matrix[hr][k]);
                    res.add(matrix[hr][k]);
                }
                hr--;
            }

//            Left side & towards top
            if (hc >= lc){
                for (int l = hr; l >= lr; l--) {
//                    System.out.println(matrix[l][lc]);
                    res.add(matrix[l][lc]);
                }
                lc++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }
}
