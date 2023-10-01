//15. Volume Of Prism

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _15_prism_volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of triangle in triangular prism: ");
        float b = sc.nextFloat();
        System.out.print("Enter the height of triangle in triangular prism: ");
        float a = sc.nextFloat();
        System.out.print("Enter the height of triangular prism: ");
        float h = sc.nextFloat();
        double volume = (0.5 * b * a) * h;
        System.out.printf("Volume of triangular prism with base of triangle %.2f, height of triangle %.2f and height %.02f is %.2f", b, a, h,  volume);
    }
}
