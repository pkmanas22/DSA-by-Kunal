//19. Curved Surface Area Of Cylinder

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _19_cylinder_curvedSurfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Cylinder: ");
        float r = sc.nextFloat();
        System.out.print("Enter the height of Cylinder: ");
        float h = sc.nextFloat();
        double csa = 2 * Math.PI * r * h ;
        System.out.printf("Curved Surface Area of Cylinder with radius %.2f and height %.02f is %.2f", r, h,  csa);
    }
}
