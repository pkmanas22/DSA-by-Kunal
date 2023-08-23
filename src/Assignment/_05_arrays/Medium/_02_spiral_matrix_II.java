//02. Spiral Matrix II
//
//    Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
//Example 1:
//    Input: n = 3
//    Output: [[1,2,3],[8,9,4],[7,6,5]]
//
//Example 2:
//    Input: n = 1
//    Output: [[1]]



package Assignment._05_arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_spiral_matrix_II {

    public static int[][] generateMatrix(int n) {
        int [][] matrix = new int[n][n];
        int x = 1;

        int lr = 0;
        int hr = n-1;
        int lc = 0;
        int hc = n-1;
        ArrayList<Integer> res = new ArrayList<>(n*n);

        while (lr<=hr && lc<=hc) {
//            Top & towards right
            for (int i = lc; i <= hc; i++) {
//                System.out.println(matrix[lr][i]);
                matrix[lr][i]=x;
                x++;
            }

//            Right side & Towards bottom
            lr++;
            for (int j = lr; j <= hr; j++) {
//                System.out.println(matrix[j][hc]);
                matrix[j][hc]=x;
                x++;
            }
            hc--;

//            Buttom & towards left
            if(hr>= lr) {
                for (int k = hc; k >= lc; k--) {
//                    System.out.println(matrix[hr][k]);
                    matrix[hr][k]=x;
                    x++;
                }
                hr--;
            }

//            Left side & towards top
            if (hc >= lc){
                for (int l = hr; l >= lr; l--) {
//                    System.out.println(matrix[l][lc]);
                    matrix[l][lc]=x;
                    x++;
                }
                lc++;
            }
        }

        return matrix;
    }
    public static void main(String[] args) {
        int num = 1;
        int[][] ans = generateMatrix(num);
        for(int [] x : ans) {
            System.out.println(Arrays.toString(x));
        }
    }
}
