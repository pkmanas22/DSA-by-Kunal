//14. Volume Of Cone Java Program
//vol = (pi * r * r * h) / 3

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _14_cone_volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of cone: ");
        float r = sc.nextFloat();
        System.out.print("Enter the height of cone: ");
        float h = sc.nextFloat();
        double Volume = (Math.PI * r * r * h) / 3;
        System.out.printf("Volume of cone with radius %.2f and height %.02f is %.2f", r, h,  Volume);
    }
}
