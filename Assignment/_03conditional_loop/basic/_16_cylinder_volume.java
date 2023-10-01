//16. Volume Of Cylinder
//Volume = Math.PI * r * r * h

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _16_cylinder_volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Cylinder: ");
        float r = sc.nextFloat();
        System.out.print("Enter the height of Cylinder: ");
        float h = sc.nextFloat();
        double Volume = Math.PI * r * r * h ;
        System.out.printf("Volume of Cylinder with radius %.2f and height %.02f is %.2f", r, h,  Volume);
    }
}
