//18. Add to Array-Form of Integer

//    The array-form of an integer num is an array representing its digits in left to right order.
//
//    For example, for num = 1321, the array form is [1,3,2,1].
//    Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
//
//    Example 1:
//
//    Input: num = [1,2,0,0], k = 34
//    Output: [1,2,3,4]
//    Explanation: 1200 + 34 = 1234

package Assignment._05_arrays.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class _18_add_to_array_formOf_integer {
    public static void main(String[] args) {
        int[] num = {1,2,6};
        ArrayList <Integer> ans = new ArrayList<>();
        int k = 898;
        int i = num.length;
        while(--i >= 0 || k > 0){
            if(i >= 0) {
                k += num[i];
            }
            ans.add(k % 10);
            k /= 10;
        }
        Collections.reverse(ans);
        System.out.println(ans);

    }
}
