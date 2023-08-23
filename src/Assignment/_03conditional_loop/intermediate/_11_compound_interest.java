//11. Compound Interest Java Program

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;


public class _11_compound_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount(P): ");
        double p = sc.nextDouble();
        System.out.print("Enter the time in years(T): ");
        float t = sc.nextFloat();
        System.out.print("Enter the % of rate of interest(R): ");
        float r = sc.nextFloat();
        System.out.print("Enter the compounding frequency(N) i.e. no. of times interest is compounded in a year: ");
        float n = sc.nextFloat();
        double amount = p * Math.pow((1 + ((r / n) / 100)),(n*t));
        System.out.printf("The compound interest is %.2f and amount to pay is %.2f" , (amount-p) , amount);
    }
}
