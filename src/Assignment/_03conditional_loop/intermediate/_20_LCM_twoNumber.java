//20. LCM Of Two Numbers

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _20_LCM_twoNumber {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int y =sc.nextInt();
        int n1 = x;
        int n2 = y;
//        int hcf = 1;
//        for (int i = 1; i <= Math.min(n1,n2); i++) {
//            if ((n1 % i == 0) && (n2 % i == 0))         {
//                hcf = i;
//            }
//        }
////        System.out.println("HCF of given two number is " + hcf);
//        int lcm = (n1 * n2) / hcf;
//        System.out.println("LCM of given two number is " + lcm);
        int hcf = 1;
        for (int j = 2; (j <= n1 || j <= n2); j++) {
                for (int i = 2; i <= j; i++) {
                    if ((n1 % i == 0) && (n2 % i == 0)) {
                        n1 = n1 / i;
                        n2 = n2 / i;
                        System.out.println(i);
                        hcf = hcf * i;
//                        System.out.println(n1 + " " + n2);
                        break;
                    }

                }
        }
        System.out.println(n1 + " " + n2);
        System.out.println("\nHCF is : " + hcf);
        System.out.println("LCM is : " + hcf * n1 * n2);
    }
}
