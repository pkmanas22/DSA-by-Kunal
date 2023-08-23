//26. Plus One
//
//    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
//    The digits are ordered from most significant to least significant in left-to-right order.
//    The large integer does not contain any leading 0's.
//    Increment the large integer by one and return the resulting array of digits.
//
//Example 1:
//
//    Input: digits = [1,2,3]
//    Output: [1,2,4]
//    Explanation: The array represents the integer 123.
//    Incrementing by one gives 123 + 1 = 124.
//    Thus, the result should be [1,2,4].

package Assignment._05_arrays.Easy;

import java.util.Arrays;

public class _26_plus_one {
    public static void main(String[] args) {
        int [] digits = {9,9,9};
        System.out.println(Arrays.toString(plusone(digits))) ;

//        int num = 0;
//        for (int i: digits) {
//            num = 10 * num + i;
//        }
////        System.out.println("num = " + num);
//        num += 1;       // plus 1
//
//        // count number of digits
//        int temp = num;
//        int count = 0;
//        while (temp > 0){
//            count++;
//            temp /= 10;
//        }
////        System.out.println("temp = " + temp);
////        System.out.println("count = " + count);
//
//        // add to res array
//        int [] res = new int[count];
//        for (int i = count-1; i >= 0; i--) {
//            res[i] = num % 10;
//            num /= 10;
////            System.out.println(res [i]);
//        }
//
//        System.out.println(Arrays.toString(res));
    }

    private static int[] plusone(int[] digits) {
        int l = digits.length;
        for (int i = l-1; i >= 0 ; i--) {
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] res = new int[l+1];
        res[0] = 1;
        return res;
    }
}
