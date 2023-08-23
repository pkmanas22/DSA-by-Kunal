//13. Perimeter Of Rhombus

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _13_rhombus_perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of rhombus: ");
        float a = sc.nextFloat();
        double Perimeter = 4 * a;
        System.out.printf("Perimeter of rhombus with side %.2f is %.2f",a,  Perimeter);
    }
}
