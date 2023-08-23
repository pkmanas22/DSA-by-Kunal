//8. Calculate Depreciation of Value

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _08_depreciation_value {
    public static void main(String[] args) {
        System.out.println("Enter the cost of Machine: ");
        Scanner sc = new Scanner(System.in);
        double cost =sc.nextDouble();
        System.out.println("Enter the Scrap Value of Machine: ");
        double scrap =sc.nextDouble();
        System.out.println("Enter the life of Machine (in Years): ");
        double life =sc.nextDouble();
        double dep = (cost - scrap) / life;
        System.out.println("Amount of depreciation = " + dep);
        double rate = (dep / cost) * 100;
        System.out.println("rate of depreciation= " + rate);
    }
}
