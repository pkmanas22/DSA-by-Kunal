//6. Input currency in rupees and output in USD.
package Assignment._02_first_Java;


import java.util.Scanner;

public class _06_currency {
    public static void main(String[] args) {
        System.out.print("Enter the currency in rupees: ");
        Scanner sc = new Scanner(System.in);
        double rupee = sc.nextDouble();
        double usd = rupee * 0.012f;
        System.out.printf("The currency in USD is %.2f" , usd);
    }
}
