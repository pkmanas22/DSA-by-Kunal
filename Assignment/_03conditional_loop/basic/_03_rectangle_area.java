//3. Area Of Rectangle Program

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _03_rectangle_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        float l = sc.nextFloat();
        System.out.print("Enter the breadth of rectangle: ");
        float b = sc.nextFloat();
        double area = l*b;
        System.out.printf("Area of rectangle with length %.2f and breadth %.02f is %.2f", l, b,  area);
    }
}
