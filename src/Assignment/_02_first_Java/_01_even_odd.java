//1. Write a program to print whether a number is even or odd, also take input from the user.
package Assignment._02_first_Java;

import  java.util.Scanner;
public class _01_even_odd {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 ==0) System.out.println(num + " is even number.");
        else System.out.println(num + " is odd number.");
    }
}
