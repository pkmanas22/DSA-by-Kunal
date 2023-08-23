//5. Calculate Distance Between Two Points

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class _05_distance_between_twoPoints {
    public static void main(String[] args) {
        System.out.println("Enter the co-ordinates of point X:");
        Scanner sc = new Scanner(System.in);
        int x1 =sc.nextInt();
        int y1 =sc.nextInt();
        System.out.println("Enter the co-ordinates of point Y:");
        int x2 =sc.nextInt();
        int y2 =sc.nextInt();
        double distance = sqrt((pow(x2-x1,2)) + pow(y2 - y1, 2));
        System.out.printf("Total distance = %.2f" , distance);
    }
}
