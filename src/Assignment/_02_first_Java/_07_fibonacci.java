//7. To calculate Fibonacci Series up to n numbers.
package Assignment._02_first_Java;


import java.util.Scanner;

public class _07_fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the n for fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int result = 0;
        if (n == 0) result = a;
        else if (n == 1) result = b;
        else{
            for (int x = 2; x <= n; x++){
                int temp = a;
                a = b;
                b = temp + a;
                result = b;
            }
        }
        System.out.println(result);
    }
}
