//22. Find N Unique Integers Sum up to Zero

//Given an integer n, return any array containing n unique integers such that they add up to 0.
//
//Example 1:
//
//    Input: n = 5
//    Output: [-7,-1,1,3,4]
//    Explanation: These arrays also are accepted
//    [-5,-1,1,2,3] , [-3,-1,2,-2,4].


package Assignment._05_arrays.Easy;

public class _22_N_unique_integers_sumUpTo_zero {
    public static void main(String[] args) {
        int n = 5;
        int [] ans = new int[n];
//        for (int i = 0; i < n; i++) {
//            if (i < n/2) {
//                ans[i] = i - (n / 2);
//            } else if (i >= n/2) {
//                ans[i] = - ans[n-i-1];
//            }else if (n % 2 != 0){
//                ans[i / 2] = 0;
//            }
//        }
        

        for (int i = 0; i < n; i++) {
            // i - n + (n/2-1) = 2i-n+1
            ans[i] = i * 2 - n + 1;
        }
        for (int j = 0; j < n; j++) {
            System.out.println(ans[j] + " ");
        }
    }
}
