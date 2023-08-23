//1. Area Of Circle Java Program

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _01_circle_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float r = sc.nextFloat();
        double area = Math.PI*r*r;
//        System.out.println("Area of circle with radius " + r + " is " + area);
        System.out.printf("Area of circle with radius %.2f is %.2f",r,  area);
    }
}
