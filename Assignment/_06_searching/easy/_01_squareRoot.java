/*69. Sqrt(x)
        Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

        You must not use any built-in exponent function or operator.

        For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.*/

//https://leetcode.com/problems/sqrtx/description/

package _06_searching.easy;

public class _01_squareRoot {
    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println(mySqrt(num));
    }

    static public int mySqrt(int x) {
        int end;
        int start;
        if (x == 0) return 0;
        else if (x == 1) return 1;
        else {
            start = 1;
            end = x;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if ((long)mid * mid > (long)x) {
                   end = mid - 1;
               }else if (mid * mid == x) {
                    return mid;
                } else {
                    start = mid + 1;
                }
            }
        }

        return end;
    }
}
