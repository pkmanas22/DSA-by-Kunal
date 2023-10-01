//20. Total Surface Area Of Cube

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _20_cube_totalSurfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of cube: ");
        float a = sc.nextFloat();
        double tsa = 6 * Math.pow(a,2);
        System.out.printf("Total Surface Area of cube with side %.2f is %.2f",a,  tsa);
    }
}
