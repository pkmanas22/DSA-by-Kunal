//22. Subtract the Product and Sum of Digits of an Integer

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _22_subtract_productAndSum {
    public static void main(String[] args) {
        System.out.print("Enter the integer: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int prod = 1;
        int sum = 0;
        int temp = input;
        while (temp != 0){
            int rem = temp % 10;
            prod *= rem;    //   prod = prod * rem
            sum += rem;
            temp /= 10;
        }
        int result;
        System.out.println(sum);
        System.out.println(prod);
        if (sum > prod) {
            result = sum - prod;
        }else {
            result = prod - sum;
        }
        System.out.println("The subtract of Product and Sum of Digits of " + input + " is " + result);
    }
}
