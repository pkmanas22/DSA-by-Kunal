//4. Calculate Discount Of Product

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _04_discount {
    public static void main(String[] args) {
        System.out.print("Enter the MRP price of product: ");
        Scanner sc = new Scanner(System.in);
        double mrp =sc.nextDouble();
        System.out.print("Enter the discount (in percentage): ");
        double dis =sc.nextDouble();
        double sp = mrp * (100 - dis) / 100;
        System.out.println("You get " + dis + "% discount on " + " MRP price " + mrp);
        System.out.println("Now, you have to pay " + sp);
    }
}
