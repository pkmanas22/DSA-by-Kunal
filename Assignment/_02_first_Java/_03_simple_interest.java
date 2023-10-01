//3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package Assignment._02_first_Java;


import java.util.Scanner;

public class _03_simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount(P): ");
        double p = sc.nextDouble();
        System.out.print("Enter the time in years(T): ");
        float t = sc.nextFloat();
        System.out.print("Enter the % of rate of interest(R): ");
        float r = sc.nextFloat();
        double si = (p*t*r)/100;

        System.out.println("The simple interest is " + si + " and amount to pay is " + (si+p));
    }
}
