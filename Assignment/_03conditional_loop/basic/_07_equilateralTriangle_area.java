//7. Area Of Equilateral Triangle

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _07_equilateralTriangle_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of equilateral triangle: ");
        float a = sc.nextFloat();
        double area = (Math.sqrt(3)*a*a)/4;
        System.out.printf("Area of equilateral triangle with side %.2f is %.2f", a,  area);
    }
}
