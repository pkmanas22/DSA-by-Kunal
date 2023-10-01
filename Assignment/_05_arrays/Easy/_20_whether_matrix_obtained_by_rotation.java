//20. Determine Whether Matrix Can Be Obtained By Rotation

package Assignment._05_arrays.Easy;

public class _20_whether_matrix_obtained_by_rotation {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] target = {{7,4,1},{8,5,2},{9,6,5}};
        boolean flag = true;
        int n = mat.length;
//        int [][] matrix= new int [n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                matrix[i][j] = mat[n-j-1][i];
                if(target [i][j] != mat[n-j-1][i]){
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag);
//        for (int [] ar: matrix) {
//            System.out.println(Arrays.toString(ar));
//        }
    }
}
