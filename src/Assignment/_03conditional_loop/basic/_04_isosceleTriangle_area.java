//4. Area Of Isosceles Triangle

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _04_isosceleTriangle_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of triangle: ");
        float b = sc.nextFloat();
        System.out.print("Enter the height of triangle: ");
        float h = sc.nextFloat();
        double area = 0.5*b*h;
        System.out.printf("Area of triangle with base %.2f and height %.02f is %.2f", b, h,  area);
    }
}
