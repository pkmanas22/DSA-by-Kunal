package _06_searching.easy;

// 367. Valid Perfect Square
// https://leetcode.com/problems/valid-perfect-square/description/
/*
 Given a positive integer num, return true if num is a perfect square or false otherwise.
 A perfect square is an integer that is the square of an integer.
 In other words, it is the product of some integer with itself.
 You must not use any built-in library function, such as sqrt.

    Example 1:
 Input: num = 16
 Output: true
 Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
*/

public class _05_validPerfectSquare {
    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num;
        while (start <= end){
            long mid = start + (end - start) / 2;
            if (mid * mid == num){
                return  true;
            } else if (mid * mid > num) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
