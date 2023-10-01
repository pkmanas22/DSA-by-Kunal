//14. Write a function that returns the sum of first n natural numbers.
// only positive numbers    i.e: 1,2,3,4,5,6...


package Assignment._04_functions;

import java.util.Scanner;

public class _14_sumOf_first_N_numbers {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int result = sum(n);
        System.out.println(result);
    }

//    Approach - 1
    /*
    static int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++){
            total = total +  i;
        }
        return total;
    }

     */
//    Approach -2
    static int sum(int n) {
        int total = (n * (n + 1)) / 2;
        return  total;
    }
}
