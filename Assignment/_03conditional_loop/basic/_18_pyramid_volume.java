//18. Volume Of Pyramid

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _18_pyramid_volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base length of rectangular pyramid: ");
        float l = sc.nextFloat();
        System.out.print("Enter the base width of rectangular pyramid: ");
        float w = sc.nextFloat();
        System.out.print("Enter the height of rectangular pyramid: ");
        float h = sc.nextFloat();
        double volume = (l * w * h) / 3;
        System.out.printf("Volume of rectangular pyramid with base length %.2f, base width %.2f and height %.02f is %.2f", l, w, h,  volume);
    }
}
