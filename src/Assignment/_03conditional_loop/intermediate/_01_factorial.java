//1. Factorial Program In Java

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _01_factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= input; i++){
            fact *= i;

        }
        System.out.println("The factorial of " + " input is : " + fact);
    }
}
