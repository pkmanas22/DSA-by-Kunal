//8. Perimeter Of Circle

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _08_circle_perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float r = sc.nextFloat();
        double peri = 2 * Math.PI * r;
        System.out.printf("Perimeter of circle with radius %.2f is %.2f",r,  peri);
    }
}
