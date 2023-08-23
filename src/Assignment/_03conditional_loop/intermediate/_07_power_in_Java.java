//7. Power In Java

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _07_power_in_Java {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println("Which power do you want: ");
        int power =sc.nextInt();
        System.out.println("The power " + power + " of num " + num + " is " + Math.pow(num,power));
    }
}
