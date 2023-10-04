package _09_conditional_loop;

import java.util.Scanner;

//calculate the nth Fibonacci number using an iterative approach
public class _03_fibonacci_number {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int temp = 0;
        int i = 2;
        while (i < n) {
            temp = a + b;
            a = b;
            b = temp;
            i++;
        }
        System.out.println(temp);
//        the code has a time complexity of O(n) and a space complexity of O(1)
    }
}
