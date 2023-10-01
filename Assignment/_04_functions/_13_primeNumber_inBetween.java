//13. Write a function that returns all prime numbers between two given numbers.



package Assignment._04_functions;

import java.util.Scanner;

public class _13_primeNumber_inBetween {
    public static void main(String[] args) {
        System.out.println("Enter two numbers, for finding prime numbers between them: ");
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        primeNumbers(n1,n2);
    }

    static void primeNumbers(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            int c = 2;
            int count = 0;
            if (i > 1){
                while (c * c <= i){
                        if (i % c == 0){
                            count++;
                            break;
                        }
                    c++;
                }
                if (count == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
