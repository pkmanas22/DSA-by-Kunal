//10. Perimeter Of Parallelogram

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _10_parallelogram_perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side a of parallelogram: ");
        float a = sc.nextFloat();
        System.out.print("Enter the side b of parallelogram: ");
        float b = sc.nextFloat();
        double Perimeter = 2 * (a + b);
        System.out.printf("Perimeter of parallelogram with length %.2f and breadth %.02f is %.2f", a, b,  Perimeter);
    }
}
