//5. Take 2 numbers as input and print the largest number.
package Assignment._02_first_Java;

import java.util.Scanner;

public class _05_largest_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        if (n1 >= n2) System.out.println(n1 + " is largest number.");
        else System.out.println(n2 + " is largest number");
    }
}
