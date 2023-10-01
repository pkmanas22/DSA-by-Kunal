package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _18_future_investment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the present value: ");
        double pv =sc.nextDouble();
        System.out.println("Enter the interest rate: ");
        double rate =sc.nextDouble();
        double r = rate / 100;
        System.out.println("Enter the compounding periods(in years): ");
        double cp =sc.nextDouble();
        System.out.println("Enter the investment period: ");
        double time =sc.nextDouble();
        double fv = pv * Math.pow((1+(r / cp)),time*cp);
        System.out.printf("The future value of given data is = %.2f" , fv);
    }
}
