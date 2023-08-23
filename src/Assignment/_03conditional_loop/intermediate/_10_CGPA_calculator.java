//10. Calculate CGPA Java Program

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _10_CGPA_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade point in CC-1 : ");
        double c1 = 6 * sc.nextInt();
        System.out.println("Enter your grade point in CC-2 : ");
        int c2 = 6 * sc.nextInt();
        System.out.println("Enter your grade point in AECC-1 : ");
        int aecc = 4 * sc.nextInt();
        System.out.println("Enter your grade point in GE-1 : ");
        int ge = 6 * sc.nextInt();
        double sgpa = (c1 + c2 + aecc + ge) / 22;
        System.out.printf("The SGPA of 1st Semester is %.2f" , sgpa);
    }
}
