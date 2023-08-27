package Lectures._04_functions;

import static java.lang.Math.pow;

// to find all Armstrong numbers of a specific digit length
public class _03_find_armstrong_number {
    public static void main(String[] args) {
        int digit = 4;
        for (int i = (int) pow(10,(digit-1)); i < pow(10,digit); i++) {
            findArmstrong(i,digit);
        }
    }

    private static void findArmstrong(int n,int digit) {
        int num = n;
        int result = 0;
        while (n != 0) {
            int rem = n % 10;
            n /= 10;
            result += (int) pow(rem,digit);
        }
        if (result == num)
            System.out.println(result);
    }

//    The time complexity of the code remains O(d * 9^d), where d is the specified digit length. The outer loop runs for 9^d times (from the lowest number with d digits to the highest number with d digits), and the inner loop performs digit extraction and powered calculation, both of which are constant time operations.
//The space complexity of the code is O(1), as it uses a constant amount of extra space regardless of the input size
}
