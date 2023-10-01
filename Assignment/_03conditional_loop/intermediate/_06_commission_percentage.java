//6. Calculate Commission Percentage

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _06_commission_percentage {
    public static void main(String[] args) {
        System.out.print("Enter the Sales price of product: ");
        Scanner sc = new Scanner(System.in);
        double sp =sc.nextDouble();
        System.out.print("Enter the Commission (in percentage): ");
        double comm =sc.nextDouble();
        double comm_amount = sp * comm / 100;
        System.out.println("You will get = " + comm_amount);
    }
}
