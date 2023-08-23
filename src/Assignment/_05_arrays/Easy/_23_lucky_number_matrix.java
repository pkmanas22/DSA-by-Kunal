//23. Lucky Number In a Matrix

//Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
//
//    A lucky number is an element of the matrix such that it is the minimum element in its row 
//    and maximum in its column.
//
//Example 1:
//
//    Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
//    Output: [15]
//    Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

package Assignment._05_arrays.Easy;

import java.util.ArrayList;

public class _23_lucky_number_matrix {
    public static void main(String[] args) {
        int [][] matrix = {{3,7,5,4},{6,1,2,8},{10,11,21,31}};
        int [] minimum = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int mi = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                mi = Math.min(mi,matrix[i][j]);
                minimum[i] = mi;
            }
//            System.out.println(minimum[i]);
        }
        int [] maximum = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            int ma = matrix[0][i];
            for (int j = 0; j < matrix.length; j++) {
                ma = Math.max(ma,matrix[j][i]);
                maximum[i] = ma;
            }
//            System.out.println(maximum[i]);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int mini : minimum){
            for (int maxi: maximum){
                if (mini == maxi){
                    res.add(maxi);
                }
            }
        }
        for(int k= 0 ; k < res.size(); k++){
            System.out.println(res.get(k));
        }
    }
}
