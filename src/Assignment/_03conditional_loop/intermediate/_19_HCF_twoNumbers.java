//19. HCF Of Two Numbers Program

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _19_HCF_twoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        int hcf = 1;
        for (int i = 1; i <= Math.min(n1,n2); i++) {
            if ((n1 % i == 0) && (n2 % i == 0))         {
                hcf = i;
            }
        }
        System.out.println("HCF of given two number is " + hcf);
//        int lcm = (n1 * n2) / hcf;
//        System.out.println("LCM of given two number is " + lcm);
    }
}
