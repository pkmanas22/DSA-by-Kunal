//1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.


package Assignment._04_functions;

import java.util.Scanner;

public class _01_maximum_minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        int n3 =sc.nextInt();
        int max = maximum(n1,n2,n3);
        int min = minimum(n1,n2,n3);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    static int minimum(int n1, int n2, int n3) {
        if (n1 <= n2){
            if (n1 <= n3)
                return n1;
            else
                return n3;
        }else {
            if (n2 <= n3)
                return n2;
            else
                return n3;
        }
    }

    static int maximum(int n1, int n2, int n3) {
        if (n1 >= n2){
            if (n1 >= n3)
                return n1;
            else
                return n3;
        }else {
            if (n2 >= n3)
                return n2;
            else
                return n3;
        }
    }
}
