//      26. Write a program to print the sum of negative numbers, sum of positive even numbers and
//          the sum of positive odd numbers from a list of numbers (N) entered by the user.
//          The list terminates when the user enters a zero.

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _26_sumOf_negative_positive_evenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negative_sum = 0;
        while (true){
            System.out.print("Enter the negative numbers & other for exit: ");
            int input = sc.nextInt();
            if(input >= 0) {
                break;
            }
            negative_sum += input;
        }
        System.out.println("\nSum of all negative numbers is " + negative_sum);
        int positive_even = 0;
        while (true){
            System.out.print("Enter the positive even numbers & other for exit: ");
            int input = sc.nextInt();
            if((input <= 0) || (input % 2 != 0)) {
                break;
            }
            positive_even += input;
        }
        System.out.println("\nSum of all positive even numbers is " + positive_even);
        int positive_odd = 0;
        while (true){
            System.out.print("Enter the positive odd numbers & other for exit: ");
            int input = sc.nextInt();
            if((input <= 0) || (input % 2 == 0)) {
                break;
            }
            positive_odd += input;
        }
        System.out.println("\nSum of all positive odd numbers is " + positive_odd);
        System.out.println("\nSum of all given numbers is " + (negative_sum + positive_even + positive_odd));
    }
}
