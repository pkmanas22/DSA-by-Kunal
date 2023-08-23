//15. Find Ncr & Npr

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _15_ncr_npr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number: ");
        int n =sc.nextInt();
        float nfact = 1;
        for (int i = n; i > 0; i--) {
            nfact = nfact * i;
        }
        System.out.println("Enter the uses number: ");
        int r =sc.nextInt();
        if (n > r)  {
            int rfact = 1;
            for (int j = r; j > 0; j--) {
                rfact = rfact * j;
            }
            int nrfact = 1;
            for (int k = (n - r); k > 0; k--) {
                nrfact = nrfact * k;
            }
        float npr = nfact / nrfact;
        float ncr = nfact / (rfact * nrfact);
        System.out.println("Total number of permutation = " + npr);
        System.out.println("Total number of combination = " + ncr);
        } else if (n == r) {
            System.out.println("Can't find the permutation and combination");
        } else if (n==0){
            System.out.println("Total number of permutation = 0");
            System.out.println("Total number of combination = 0");
        }
    }
}
