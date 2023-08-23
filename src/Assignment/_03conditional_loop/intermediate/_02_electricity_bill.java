//2. Calculate Electricity Bill

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _02_electricity_bill {
    public static void main(String[] args) {

        System.out.print("Enter total unit consumption (in kWh): ");

        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int n = unit;
        double cost = 0.0f;
        double fixed_charge = 20;
        if(n > 0 && n <= 50){
            cost = n * 3;
        }else if(n > 50 && n <= 200){
            cost = 50 * 3;
            n -= 50;
            cost += (n * 4.8);
        }else if(n > 200 && n <= 400){
            cost = (50 * 3) + (150 * 4.8);
            n -= 200;
            cost += (n * 5.8);
        }else if(n > 400){
            cost = (50 * 3) + (150 * 4.8) + (200 * 5.8);
            n -= 400;
            cost += (n * 6.2);
        }

        System.out.println("Total cost for " + unit + " kWh is " + (cost));
    }
}
