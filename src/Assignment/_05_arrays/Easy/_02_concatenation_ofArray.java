//2. Concatenation of Array
// add same array into last

package Assignment._05_arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class _02_concatenation_ofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n =sc.nextInt();
        int [] nums = new int[n];

        System.out.println("Enter the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int [] ans = new int[n + n];
        for (int j = 0; j < n; j++) {
            ans[j] = ans[j + n] = nums[j];
        }
        System.out.println(Arrays.toString(ans));
    }
}
