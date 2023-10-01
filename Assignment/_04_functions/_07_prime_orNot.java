//7. Define a method to find out if a number is prime or not.


package Assignment._04_functions;

import java.util.Scanner;

public class _07_prime_orNot {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int c = 2;
        while (c *c <= num){
            if (num % c == 0){
                return  false;
            }
            c++;
        }
        return  c * c > num;
    }
/*
    static void isPrime(int num) {
        boolean flag = true;
        if (num <= 1) {
                flag = false;
            }
        int i = 2;
        int count = 0;
        while (i < num){
            if (num % i == 0){
                count++;
            }
            i++;
        }
        if (count > 0){
            flag = false;
        }
        System.out.println(flag);

    }
 */

}
