//9. To find Armstrong Number between two given number.
//abc= a ^ 3 + b^3+c^3
//abcd = a^4 + b^4 + c^4 + d^d
//153 = 1+125+27
//1634 = 1+1296+81+256

package Assignment._02_first_Java;


import java.util.Scanner;

import static java.lang.Math.pow;

public class _09_armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two number for finding Armstrong number: ");
        int p,q;
        p = sc.nextInt();
        q= sc.nextInt();
        int total = 0;
        for (int n = p; n <= q; n++){
            int num = n;
            int count = 0;
            while (num != 0 ){
                num = num/10;
                count++;
            }
//            System.out.println(count);
            int y = n;
            int x = 0;
            double amst = 0;
            while (y!= 0){
                int rem = y % 10;
                amst = pow(rem,count) + amst;
                y /= 10;
            }
//            System.out.println(amst);
            if (n == amst){
                total++;
                System.out.print(n + " ");
            }
        }
        System.out.println("\nTotal number of armstrong is " + total);
    }
}

