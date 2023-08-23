//25. Reshape the Matrix
//
//    In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
//    You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
//    The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
//    If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
//
//Example 1:
//
//    Input: mat = [[1,2],[3,4]], r = 1, c = 4
//    Output: [[1,2,3,4]]


package Assignment._05_arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class _25_reshape_matrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4},{5,6}};
        int r = 2;
        int c  = 3;
        ArrayList<Integer> arl = new ArrayList<>();
        int[][] res = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
//                System.out.println(mat[i][j]);
                arl.add(mat[i][j]);
            }
        }
//        System.out.println(arl.size());
//        for (int i = 0; i < arl.size(); i++) {
//            System.out.println(arl.get(i));
//        }
        if (arl.size() == (r * c)) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    res[i][j] = arl.get((c * i) + j);
                    System.out.print(res[i][j]);
                }
                System.out.println();
            }
        }else {
            for(int [] n: mat){
                System.out.println(Arrays.toString(n));
            }
        }
    }

}
