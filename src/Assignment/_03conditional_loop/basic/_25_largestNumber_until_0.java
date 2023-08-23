//25. Take integer inputs till the user enters 0 and print the largest number from all.

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _25_largestNumber_until_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int large = 0;
        do {
            System.out.println("Enter the number: ");
            input = sc.nextInt();
            if (input > large){
                large = input;
            }
        } while (input != 0);
        System.out.println("The largest number from the given numbers is " + large);
    }
}
