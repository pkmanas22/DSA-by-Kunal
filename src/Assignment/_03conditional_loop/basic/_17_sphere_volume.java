//17. Volume Of Sphere

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _17_sphere_volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Sphere: ");
        float r = sc.nextFloat();
        double Volume = (4*Math.PI*Math.pow(r,3))/3;
        System.out.printf("Volume of Sphere with radius %.2f is %.2f",r,  Volume);
    }
}
