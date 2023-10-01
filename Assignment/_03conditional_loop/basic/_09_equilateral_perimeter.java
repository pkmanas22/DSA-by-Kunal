//9. Perimeter Of Equilateral Triangle

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _09_equilateral_perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of equilateral triangle: ");
        float a = sc.nextFloat();
        double Perimeter = 3 * a;
        System.out.printf("Perimeter of equilateral triangle with side %.2f is %.2f",a,  Perimeter);
    }
}
