//6. Area Of Rhombus
// area = length * breadth
// area = 0.5 * diagonal1 * diagonal2

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _06_rhombus_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rhombus: ");
        float l = sc.nextFloat();
        System.out.print("Enter the breadth of rhombus: ");
        float b = sc.nextFloat();
        double area = l*b;
        System.out.printf("Area of rhombus with length %.2f and breadth %.02f is %.2f", l, b,  area);
    }
}
