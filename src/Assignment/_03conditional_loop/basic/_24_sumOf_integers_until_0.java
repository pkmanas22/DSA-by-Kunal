//24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _24_sumOf_integers_until_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number: ");
        int input = sc.nextInt();
        while (input != 0){
            sum += input;
            System.out.println("Enter the number: ");
            input = sc.nextInt();
        }
        System.out.println("Sum of all given numbers is " + sum);
    }
}
