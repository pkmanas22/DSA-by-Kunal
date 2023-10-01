//5. Area Of Parallelogram (samantarik chitra)

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _05_parallelogram_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of parallelogram: ");
        float b = sc.nextFloat();
        System.out.print("Enter the height of parallelogram: ");
        float h = sc.nextFloat();
        double area = b*h;
        System.out.printf("Area of parallelogram with base %.2f and height %.02f is %.2f", b, h,  area);
    }
}
